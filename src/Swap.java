import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
        for (int i = 1; i< array.length; i++) {
            int temp = array[i-1];
            array[i-1] = array[i];
            array[i] = temp;
        }
        swap(array, 2, 4);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int pos1, int pos2) {
        for (int i = 1; i< array.length; i++) {
            int temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }
    }
}
