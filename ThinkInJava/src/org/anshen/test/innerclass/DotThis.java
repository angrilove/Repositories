
package org.anshen.test.innerclass;

public class DotThis {
	void d() {
		System.out.println("DotThis.d()");
	}
	
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().d();
	}
	
}
