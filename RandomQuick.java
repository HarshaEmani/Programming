import java.util.*;

public class RandomQuick {
    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    public static void quicksort(int[] arr, int low, int high) {
        int pivot;

        if (low < high) {
            pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

        return;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = (int)(Math.random() * (high - low) + low);
        pivot = arr[pivot];
        int i = low, j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                i++;
            } 

            while (arr[j] > pivot && j > 0) {
                j--;
            }

            if (i < j)
                swap(arr, i, j);
        } 

        swap(arr, low, j);
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 11,13,7,12,16,9,24,5,10,3 };

        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
