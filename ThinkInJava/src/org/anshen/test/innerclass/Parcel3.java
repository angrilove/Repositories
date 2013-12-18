
package org.anshen.test.innerclass;

public class Parcel3 {
	class Contents {
		private int i =  11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		// Must use instance of outer class
		// to create an instance of the inner class:
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Pical");
		
		System.out.println(c);
		System.out.println(c.value());
		System.out.println(d);
		System.out.println(d.readLabel());
		
	}
}