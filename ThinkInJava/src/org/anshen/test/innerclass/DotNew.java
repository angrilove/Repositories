
package org.anshen.test.innerclass;

public class DotNew {
	public class Inner {}
	
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		System.out.println(dn);
		System.out.println(dni);
	}
}
