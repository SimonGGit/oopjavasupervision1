package uk.ac.cam.stjg2.oopjava.supervision1;

public class LinkedList {
    LLElement head;

    public LinkedList(int v) {
        head = new LLElement(v, null);
    }

    public LinkedList(int[] v) {
        head = new LLElement(v[0], null);
        LLElement cur = head;
        for (int i = 1; i < v.length; i++) {
            cur.setNext(new LLElement(v[i], null));
            cur = cur.next();
        }
    }

    public LLElement getHead() {
        return head;
    }

    public void add(int v) {
        LLElement cur = head;
        while (cur.next() != null) {
            cur = cur.next();
        }
        cur.setNext(new LLElement(v, null));
    }

    public void add(LLElement e) {
        LLElement cur = head;
        while (cur.next() != null) {
            cur = cur.next();
        }
        cur.setNext(e);
    }

    public void delete(int n) {
        LLElement prev = null;
        LLElement cur = head;
        n -= 1;
        while (n > 0 && cur != null) {
            n -= 1;
            prev = cur;
            cur = cur.next();
        }
        if (cur == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (prev == null) {
            head = null;
        } else {
            prev.setNext(cur.next());
        }
    }

    public int getLength() {
        LLElement cur = head;
        int count = 1;

        while (cur.next() != null) {
            count += 1;
            cur = cur.next();
        }
        return count;
    }

    public int get(int n) {
        LLElement cur = head;
        n -= 1;
        while (n > 0 && cur != null) {
            n -= 1;
            cur = cur.next();
        }
        if (n > 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return cur.getValue();
        }
    }

    public boolean hasCycle() {
        LLElement slow = head;
        LLElement fast = slow.next();
        while (slow.getValue() != fast.getValue() && fast.next() != null && fast.next().next() != null) {
            slow = slow.next();
            fast = fast.next().next();
        }
        return (fast.next() != null && fast.next().next() != null);
    }
}