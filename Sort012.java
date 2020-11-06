import java.util.*;

class Sort012 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), arr[] = new int[n];
        int zero = 0, one = 0, two = arr.length - 1;

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        while (one <= two) {
            if (arr[one] == 1) 
                one++;

            else if (arr[one] == 0) {
                swap(arr, zero, one);
                zero++;
                one++;
            }

            else{
                swap(arr, one, two);
                two--;
            }
        }

        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}