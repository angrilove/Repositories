//: innerclass/Parcel7.java
// Returning an instance of an anonymous inner class.

package org.anshen.test.innerclass;

public class Parcel9 {

    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("July");
        System.out.println(d);
    }
    
} ///:~
