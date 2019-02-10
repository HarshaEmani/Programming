/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Combinations {
    static int prevSum = 0, prevIndex = 0;

    private static void combinationsUtil(int str[], int size){
        int temp[] = new int[size];
        combinations(str, temp, 0, 0, size);

        //for(int i = 0; i < size; i++)
          //  System.out.print(temp[i] + " ");
            //System.out.println();
    }

    private static void combinations(int str[], int temp[], int i, int index, int size){
        if(index >= size){
            for(int k =  0; k < size; k++)
                System.out.print(temp[k] + " ");
            System.out.println();

            return;
        }

        if(i >= str.length)
            return;

        //prevSum = sum;
        //sum += str[i];

        //if(sum > prevSum)
          //  prevIndex = i;

        temp[index] = str[i];
        combinations(str, temp,i + 1, index + 1, size);

        combinations(str, temp, i + 1, index, size);

        return;
    }

    private static int[] sort(int str[]){
        for(int i = 0; i < str.length; i++)
            for(int j = i + 1; j < str.length; j++)
                if(str[i] > str[j]) {
                    str[i] = str[i] + str[j];
                    str[j] = str[i] - str[j];
                    str[i] = str[i] - str[j];
                }

        return str;
    }

    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0){

            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            for(int size = 1; size <= arr.length; size++)
                combinationsUtil(arr, size);

            System.out.println();
            t--;
        }
    }
}
