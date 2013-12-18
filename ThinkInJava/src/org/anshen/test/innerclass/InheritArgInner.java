
package org.anshen.test.innerclass;

class WithArgInner {
    class ArgInner {
        private String label;
        ArgInner(String s) {
            label = s;
        }
    }
}

public class InheritArgInner extends WithArgInner.ArgInner {
    public InheritArgInner(WithArgInner wai, String s) {
        wai.super(s);
        //wai.super();
    }
    
    public static void main(String[] args) {
        WithArgInner wai = new WithArgInner();
        InheritArgInner iai = new InheritArgInner(wai, "ts");
        System.out.println(wai);
        System.out.println(iai);
    }
}
