//: innerclass/Parcel7.java
// Returning an instance of an anonymous inner class.

package org.anshen.test.innerclass;

public class Parcel7b {
    public Contents contents() {
        return new MyContents();
    }
    
    class MyContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    
    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
        System.out.println(c);
    }
} ///:~
