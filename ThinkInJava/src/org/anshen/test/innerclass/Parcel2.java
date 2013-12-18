
package org.anshen.test.innerclass;

public class Parcel2 {
    class Contents {
        private int i = 11;
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
    
    public Destination to(String s) {
        return new Destination(s);
    }
    
    public Contents contents() {
        return new Contents();
    }
    
    public void ship(String dest) {
        Contents c = this.contents();
        Destination d = this.to(dest);
        System.out.println(d.readLabel());
    }
    
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        // Defining references to inner class.
        Parcel2 p2 = new Parcel2();
        Parcel2.Contents c = p2.contents();
        Parcel2.Destination d = p2.to("Borneo");
        System.out.println(c);
        System.out.println(d);
        System.out.println("-----------»è¸îÏß--------");
    }
}