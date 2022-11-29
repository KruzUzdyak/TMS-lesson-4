import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] array = new int[10][];
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 1, 5, 6},
                {7, 8, 9, 0, 1, 2}
        };

        array[1] = new int[6];
        array[2] = new int[20];


        System.out.println("elem [2][4] - " + matrix[1][2]);
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
