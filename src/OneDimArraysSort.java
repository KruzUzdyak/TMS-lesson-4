import java.util.Arrays;

public class OneDimArraysSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 4, 3, 77, 5, 111, 7, 8, 9};

        System.out.println(Arrays.toString(array));
        // быстрая сортировка под капотом
        Arrays.sort(array, 3, 7);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // поиск работает только в отсортириованном массиве!
        int pos = Arrays.binarySearch(array, 77);
        System.out.println(pos + " - " + array[pos]);

        // копирование массивов

        int[] copyArray = new int[array.length];
        System.arraycopy(array, 4, copyArray, 4, 5);

        int[] anotherCopyArray = Arrays.copyOf(array, 8);

        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.toString(anotherCopyArray));

        // сложность алгоритма О(n), n - размер массива
        // сортировка пузырьком - n^2

        // сортировка слиянием n*log(n) \ худший случай n*log(n)
        // быстрая сортировка n*log(n) \ худший случай n^2
        // habr - поискать статьи
    }
}
