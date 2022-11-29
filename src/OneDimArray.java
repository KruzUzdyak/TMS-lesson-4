import java.util.Arrays;
import java.util.Random;

public class OneDimArray {

    public static void main(String[] args) {
        String[] strings = new String[5];
        int[] array1;
        array1 = new int[10];
        int[] array2 = new int[]{10, 1, 4, 3, 77, 5, 111, 7, 8, 9};
        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array4 = new int[20];

        Arrays.fill(array4, 22);

        Random random = new Random();
        for (int i = 0, a = 10; i < array3.length; i++, a++) {
            array1[i] = 10 * a;
//            array3[i] = (int) (10 * Math.random());
            array3[i] = random.nextInt(50);
        }
        strings[1] = "first";
        // нельзя инициализировать массив таким циклом (foreach)
        for (String s : strings){
            s = "abc";
            System.out.print(s);
        }
        System.out.println();

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(strings));

        System.out.println("string".charAt(1));

        System.out.println(Arrays.toString(array4));

        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("------------------");
        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
