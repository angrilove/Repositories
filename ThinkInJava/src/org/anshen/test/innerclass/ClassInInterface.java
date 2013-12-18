
package org.anshen.test.innerclass;

public interface ClassInInterface {
    void howdy();
    
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("howdy");
        }
        
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
