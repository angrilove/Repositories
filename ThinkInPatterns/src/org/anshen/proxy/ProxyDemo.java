/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.proxy;

import org.junit.Test;

interface ProxyBase {
	void f();
	void g();
	void h();
}

class Implementation implements ProxyBase {

	@Override
	public void f() {
		System.out.println("Implementation.f()");
	}

	@Override
	public void g() {
		System.out.println("Implementation.g()");
	}

	@Override
	public void h() {
		System.out.println("Implementation.h()");
	}
	
}

class Proxy implements ProxyBase {
	private ProxyBase impl;
	
	public Proxy() {
		impl = new Implementation();
	}

	@Override
	public void f() {
		impl.f();
	}

	@Override
	public void g() {
		impl.g();
	}

	@Override
	public void h() {
		impl.h();
	}
	
}

public class ProxyDemo {
	
	@Test
	public void test() {
		Proxy pxy = new Proxy();
		pxy.f();
		pxy.g();
		pxy.h();
	}
}
