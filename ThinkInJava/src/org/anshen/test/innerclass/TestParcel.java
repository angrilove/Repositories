
package org.anshen.test.innerclass;

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Sencha");
		
		Parcel4.InnerDestination id = p.new InnerDestination("Sony.lot");
		
		System.out.println( p );
		System.out.println( c );
		System.out.println( d );
		System.out.println( id );
		
	}
}