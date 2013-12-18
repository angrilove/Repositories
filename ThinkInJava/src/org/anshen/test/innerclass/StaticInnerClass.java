
package org.anshen.test.innerclass;

public class StaticInnerClass {
	static class StaticClass {
		public static void show() {
			System.out.println(StaticClass.class);
		}
		
		public void showAll() {
			System.out.println(StaticClass.class);
			System.out.println(StaticInnerClass.class);
//			System.out.println(StaticInnerClass.this); // error
		}
	}
	
	public static void main(String[] args) {
		System.out.println(StaticInnerClass.StaticClass.class);
		StaticInnerClass sic = new StaticInnerClass();
		StaticInnerClass.StaticClass.show();
	}
}