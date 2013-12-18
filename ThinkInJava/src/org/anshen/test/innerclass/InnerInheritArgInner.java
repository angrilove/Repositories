
package org.anshen.test.innerclass;

class InnerWithArgInner {
    class ArgInner {
        private String label;
        ArgInner(String s) {
            label = s;
        }
    }
}

public class InnerInheritArgInner {
    
    class InnerInherit extends InnerWithArgInner.ArgInner {
        InnerInherit(InnerWithArgInner wai, String s) {
            wai.super(s);
        }
    }
    
    public static void main(String[] args) {
        
        InnerInherit ii  = new InnerInheritArgInner().new InnerInherit(new InnerWithArgInner(), "dd");
        
        System.out.println( ii );
    }
}
