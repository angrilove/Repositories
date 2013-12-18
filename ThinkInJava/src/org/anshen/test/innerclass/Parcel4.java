
package org.anshen.test.innerclass;

public class Parcel4 {
	private class InnerContents implements Contents {
		private int i =  11;
		public int value() {
			return i;
		}
	}
	
	protected class InnerDestination implements Destination {
		private String label;
		InnerDestination(String s) {
			label = s;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Contents contents() {
		return new InnerContents();
	}
	
	public Destination destination(String s) {
		return new InnerDestination(s);
	}
	
}