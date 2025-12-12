import java.util.Arrays;
import java.util.Comparator;

public class SimpleSortDriver {
    public static void main(String[] args) {
        Comparator<Integer> comp = Comparator.naturalOrder();

        Integer[] arr1 = {5, 1, 9, 3, 7, 6};
        Integer[] arr2 = {9, 8, 7, 6, 5, 4};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6};

        System.out.println("--- Test 1: Unsorted ---");
        System.out.println("Before: " + Arrays.toString(arr1));
        SimpleSorters.bubbleSort(arr1, comp);
        System.out.println("After Bubble: " + Arrays.toString(arr1));

        System.out.println("\n--- Test 2: Reverse Sorted ---");
        System.out.println("Before: " + Arrays.toString(arr2));
        SimpleSorters.insertionSort(arr2, comp);
        System.out.println("After Insertion: " + Arrays.toString(arr2));

        System.out.println("\n--- Test 3: Already Sorted ---");
        System.out.println("Before: " + Arrays.toString(arr3));
        SimpleSorters.bubbleSort(arr3, comp);
        System.out.println("After Bubble: " + Arrays.toString(arr3));
    }
}
