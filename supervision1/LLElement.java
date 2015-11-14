package uk.ac.cam.stjg2.oopjava.supervision1;

public class LLElement {
    int val;
    LLElement ref;

    public LLElement(int v, LLElement next) {
        val = v;
        ref = next;
    }

    public LLElement next() {
        return ref;
    }

    public int getValue() {
        return val;
    }

    public void setNext(LLElement nextElement) {
        ref = nextElement;
    }

    public void setValue(int v) {
        val = v;
    }
}