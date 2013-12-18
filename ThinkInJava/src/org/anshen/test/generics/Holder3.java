
package org.anshen.test.generics;

public class Holder3<T> {
    private T o;
    
    public void Holder2(T o) {
        this.o = o;
    }

    public void set(T o) {
        this.o = o;
    }

    public T get() {
        return o;
    }

    public static void main(String[] args) {
        Holder2 h;
    }
}