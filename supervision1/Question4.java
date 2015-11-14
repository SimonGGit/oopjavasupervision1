package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question4 {
    public static int sum(int[] a) {
        int total = 0;
        //This is a for loop which says for all num in a do something. I find this method less tedious,
        //but if you prefer the method we discussed during the lectures, just use:
        //      for (int i = 0; i < a.length; i++) {
        //          total += a[i];
        //      }

        for (int num : a) {
            total += num;
        }
        return total;
    }

    public static int[] cumsum(int[] a) {
        int[] total = new int[a.length];
        if (a.length != 0) {
            total[0] = a[0];
            for (int i = 1; i < a.length; i++) {
                total[i] = total[i - 1] + a[i];
            }
        }
        return total;
    }

    public static int[] positives(int[] a) {
        int numberOfEvens = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                numberOfEvens += 1;
            }
        }
        int[] l = new int[numberOfEvens];

        int index = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                l[index] = num;
                index += 1;
            }
        }
        return l;
    }

}