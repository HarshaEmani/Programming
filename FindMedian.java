import java.util.*;

public class FindMedian {
    public static void main(String[] args){
        Solution s = new Solution();
        int arr[] = {18, 2,10, 13, 8, 8};
        System.out.println(s.find_median(arr));
    }
}

class Solution{
    
    public static int average(int a, int b){
        return (a + b) / 2;
    }
    
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return;
    }
    
    public static void halfSort(int[] arr){
        for(int i = 0; i < (arr.length / 2) + 1; i++){
            int min = i;
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            
            swap(arr, i, min);
        }
        
        System.out.println(Arrays.toString(arr));
        return;
    }
    
    public int find_median(int[] v){
        // Code here
        halfSort(v);
        System.out.println(Arrays.toString(v));
        if(v.length % 2 == 1)
            return v[v.length / 2];
        return average(v[v.length / 2], v[(v.length / 2) - 1]);
    }
}