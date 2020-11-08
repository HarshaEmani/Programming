import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return;
    }

    public static void merge(int[] arr, int low, int mid, int high){
        if(low == high)
            return;

        int arr1[] = new int[mid - low + 1];
        int arr2[] = new int[high - mid], i = 0, j = 0, k = low;

        for(int index = 0; index < arr1.length; index++)
            arr1[index] = arr[low + index];

        for(int index = 0; index < arr2.length; index++)
            arr2[index] = arr[mid + 1 + index];

        for(i = 0, j = 0; i < arr1.length && j < arr2.length;){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        for(; i < arr1.length; i++)
            arr[k++] = arr1[i];
        for(; j < arr2.length; j++)
            arr[k++] = arr2[j];

        return;
    }

    public static void main(String[] args){
        int[] arr = {12, 89, 13, 76, 33, 98, 44, 90};

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
