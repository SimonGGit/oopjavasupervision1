package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question6 {

    public static int a = 0;
    public static int b = 2;
    public static void main(String[] args) {
        //int a = 0;
        //int b = 2;
        //Moving the declarations of the variables from inside the main function to outside makes the scope in which
        //they are accessible and can be changed bigger, thus allowing them to be changed in the addVector function
        int[] res = vectorAdd(a, b, 1, 1);
        a = res[0];
        b = res[1];
        System.out.println(a + " " + b);
    }

    public static int[] vectorAdd(int x, int y, int dx, int dy) {
        //Changed this function slightly to make it more readable
        x += dx;
        y += dy;
        return new int[]{x,y};
    }
}