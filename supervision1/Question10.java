package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question10 {
    public static void main(String[] args) {
        Stack s = new Stack(0);
        for (int i = 1; i < 10; i++) {
            s.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(s.pop());
        }
    }
}