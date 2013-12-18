/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.proxy;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

interface Connection {
	Object get();
	void set(Object o);
	void release();
}

class ConnectionImpl implements Connection {

	@Override
	public Object get() {
		return null;
	}

	@Override
	public void set(Object o) {
		
	}

	@Override
	public void release() {
		
	}
	
}

class ConnectionPool {
	private static PoolManager pool = new PoolManager();
	private ConnectionPool() {}
	
	public static void addConnections(int num) {
		for (int i = 0; i < num; i++)
			pool.add(new ConnectionImpl());
	}
	
	public static Connection getConnection() {
		PoolManager.ReleasableReference rr = pool.get();
	if (rr == null) return null;
	return new ConnectionProxy(rr);
	}
	
	private static class ConnectionProxy implements Connection {
		private PoolManager.ReleasableReference impl;
		public ConnectionProxy(PoolManager.ReleasableReference rr) {
			impl = rr;
		}
		
		@Override
		public Object get() {
			return impl.getReference();
		}
		
		@Override
		public void set(Object o) {
			((Connection)impl.getReference()).set(o);
		}
		
		public void release() { impl.release();}
	}
}

public class ConnectionPoolProxyDemo extends TestCase {
	static {
		ConnectionPool.addConnections(5);
	}
	
	public void setup() {
		System.out.println("AAAAA");
		Connection cnn = ConnectionPool.getConnection();
		cnn.set(new Object());
		cnn.get();
		cnn.release();
	}
	
	@Test
	public void testDisable() {
		Connection cnn = ConnectionPool.getConnection();
		String msg = null;
		cnn.set(new Object());
		cnn.get();
		cnn.release();
		try {
			cnn.get();
		} catch (Exception e) {
			msg = e.getMessage();
			System.out.println(msg);
		}
		Assert.assertEquals(msg, "Tried to use reference after it was released.");
	}
}
