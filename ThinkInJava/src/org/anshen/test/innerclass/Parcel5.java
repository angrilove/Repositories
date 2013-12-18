
package org.anshen.test.innerclass;

public class Parcel5 {
    public Destination destination(String s) {
        class InnerDestination implements Destination {
            private String label;
            private InnerDestination(String s) {
                label = s;
            }
            public String readLabel() {
                return label;
            }
        }
        return new InnerDestination(s);
    }
    
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Jelly");
        System.out.println(d.readLabel());
    }
}
