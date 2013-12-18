
package org.anshen.test.typeinfo;

class Candy {
    static {
        System.out.println("Candy");
    }
}

class Gum {
    static {
        System.out.println("Gum");
    }
}

class Cookie {
    static {
        System.out.println("Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        new Candy();
        try {
            Class.forName("org.anshen.test.typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            // e.printStackTrack();
            System.out.println("not loaded Gum");
        }
        new Cookie();
    }
}