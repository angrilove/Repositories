
package org.anshen.test.innerclass;

public class Sequence {
    private Object[] items;
    private int next = 0;
    
    public Sequence(int size) {
        items = new Object[size];
    }
    
    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;
        }
    }
    
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return (i == items.length);
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }
    
    public Selector selector() {
        return new SequenceSelector();
    }
    
    public static void main(String[] args) {
        System.out.println("-----------start-------------");
        Sequence sequence = new Sequence(10);
        System.out.println("length:" + sequence.items.length);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        System.out.println("-------------end-------------");
    }
}