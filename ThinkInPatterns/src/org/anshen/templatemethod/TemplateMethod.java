package org.anshen.templatemethod;

import org.junit.Test;

abstract class ApplicationFramework {
	
	public ApplicationFramework() {
		templateMethod(); // dangerous!!
	}
	
	abstract void method1();
	abstract void method2();
	
	final void templateMethod() {
		this.method1();
		this.method2();
	}
}

class MyApp extends ApplicationFramework {

	@Override
	void method1() {
		System.out.println("method1");
	}

	@Override
	void method2() {
		System.out.println("method2");
	}
	
}

public class TemplateMethod {
	
	@Test
	public void test() {
		new MyApp();
	}
}
