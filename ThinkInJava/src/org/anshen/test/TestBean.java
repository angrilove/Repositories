
package org.anshen.test;

public class TestBean {
	
	public static void main(String[] args) throws RuntimeException {
		try {
			System.out.println(TestBean.class);
			System.out.println(Class.forName("org.anshen.test.TestBean"));
			Class<TestBean> c = TestBean.class;
			Class<?> f = Class.forName("org.anshen.test.TestBean");
			
			System.out.println(c);
			System.out.println(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static {
		System.out.println("static field...");
	}
	
}
