package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question2 {

    public int primitive = 3;

    public int[] reference = new int[]{1, 2, 3};

    public class Cube {
        int side;
        public Cube(int s) {
            side = s;
        }
    }

    public Cube object = new Cube(2);
}