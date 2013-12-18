
package org.anshen.test.innerclass;

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor. i = " + i);
    }
    public abstract void print();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer.");
            }
//          private int n = i;
            public void print() {
                System.out.println("In anonymous print()");
            }
        };
    }
    public static void main(String[] args) {
        Base b = getBase(47);
        b.print();
    }
} ///:~
