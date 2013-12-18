package org.anshen.test.impls;

public class Super {
	
	public Super() {
		System.out.println("Super class constructor invoke.");
	}
	
	public Super(String self) {
		System.out.println("Super class constructor Super(String self) invoke.");
	}
	
	public static void main(String[] args) {
		
		Sun s = new Sun();
		
		System.out.println(s);
		
	}
	
}

class Sub extends Super {
	
	public Sub() {
		super("good");
		System.out.println("Sub class constructor invoke.");
	}
	
}

class Sun extends Sub {
	
	public Sun() {
		System.out.println("Sun class constructor invoke.");
	}
	
}

