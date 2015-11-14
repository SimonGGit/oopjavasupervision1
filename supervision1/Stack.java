package uk.ac.cam.stjg2.oopjava.supervision1;

public class Stack {
    StackElement head;

    public Stack(Object v) {
        head = new StackElement(v);
    }

    public void push(Object v) {
        head = new StackElement(v, head);
    }

    public Object pop() {
        Object v = head.getValue();
        head = head.next();
        return v;
    }
}