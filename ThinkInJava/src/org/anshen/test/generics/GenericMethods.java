
package org.anshen.test.generics;

public class GenericMethods {
    
    public <T> void print(T t) {
        System.out.println(t.getClass().getName());
    }

    public <T> String printClassFullName(T t) {
        return t.getClass().getName();
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.print("");
        gm.print(1);
        gm.print(1.0);
        gm.print(1.0F);
        gm.print('c');
        gm.print(gm);
        try {
            System.out.println(Class.forName(gm.printClassFullName('c')));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            throw new Exception("Class not initialization.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
