package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question5 {

    public static void main(String[] args) {
        //just a little function to test my function, can be ignored, but I thought I would include it for further
        //reference and any revision
        float[] num = new float[args.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Float.parseFloat(args[i]);
        }
        float[][] m = createSquareMatrix(num);
        if (m.length == 0) {
            System.out.println("Not the correct format, not possible to form a square matrix from " + String.valueOf(args.length) + " items.");
        }
        String line;
        for (int i = 0; i < m.length; i++) {
            line = "";
            for (int j = 0; j < m[i].length; j++) {
                line += " " + String.valueOf(m[i][j]);
            }
            System.out.println(line);
        }
    }

    public static float[][] createSquareMatrix(float[] numbers) {
        //As the input format was not specified I presumed you get get a list of a square length containing all the
        //numbers that need to be put in the matrix in order of rows.
        int n = (int) Math.sqrt(numbers.length);
        if (n * n != numbers.length) {
            //would like to do something like this: throw new InvalidInputException();
            //is a bit excessive for this supervision, so just return an empty matrix
            return new float[0][0];
        }

        float[][] matrix = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = numbers[i * n + j];
            }
        }
        return  matrix;
    }
}