
package org.anshen.test.generics;

public class Holder2 {
    private Object o;
    public Holder2(Object o) {
        this.o = o;
    }
    public void set(Object o) {
        this.o = o;
    }
    public Object get() {
        return o;
    }
    public static void main(String[] args) {
        Holder2 h;
    }
}