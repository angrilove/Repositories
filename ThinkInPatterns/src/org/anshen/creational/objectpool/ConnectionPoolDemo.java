/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.creational.objectpool;

import org.junit.Test;

interface Connection {
	Object get();
	void set(Object o);
}

class ConnectionImpl implements Connection {
	@Override public Object get() { return null;};
	
	@Override public void set(Object o) {}
}

class ConnectionPool {
	private static PoolManager pm = new PoolManager();
	public static void addConnections(int number) {
		for (int i = 0; i < number; i++) {
			pm.add(new ConnectionImpl());
		}
	}
	
	public static Connection getConnection() throws PoolManager.EmptyPoolException {
		return (Connection) pm.get();
	}
	
	public static void releaseConnection(Connection cnn) {
		pm.release(cnn);
	}
}

public class ConnectionPoolDemo {
	static {
		ConnectionPool.addConnections(5);
	}
	
	@Test
	public void connectionTest() {
		Connection ctn = null;
		try {
			ctn = ConnectionPool.getConnection();
		} catch (PoolManager.EmptyPoolException e) {
			throw new RuntimeException(e);
		}
		ctn.set(new Object());
		ctn.get();
		ConnectionPool.releaseConnection(ctn);
	}
	
	@Test
	public void test2() {
		Connection ctn = null;
		try {
			ctn = ConnectionPool.getConnection();
		} catch (PoolManager.EmptyPoolException e) {
			throw new RuntimeException(e);
		}
		ctn.set(new Object());
		ctn.get();
		ConnectionPool.releaseConnection(ctn);
	}
}
