package uk.ac.cam.stjg2.oopjava.supervision1;
public class StackElement {
    Object val;
    StackElement ref;

    public StackElement(Object v) {
        val = v;
        ref = null;
    }

    public StackElement(Object v, StackElement next) {
        val = v;
        ref = next;
    }


    public StackElement next() {
        return ref;
    }

    public Object getValue() {
        return val;
    }

    public void setNext(StackElement nextElement) {
        ref = nextElement;
    }

    public void setValue(Object v) {
        val = v;
    }
}