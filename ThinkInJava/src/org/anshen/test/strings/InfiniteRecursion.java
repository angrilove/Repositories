// : strings InfiniteRecursion.java
// accidental recursion
package org.anshen.test.strings;

import java.util.*;

public class InfiniteRecursion {
    
    public String toString() {
        // You should use `super.toString()`
        return " InfiniteRecursion address: " + this + "\n"; // StackOverflowError..
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
