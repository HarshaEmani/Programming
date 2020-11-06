public class TestDebug {
    static int sum = 0;

    public static void printSubArrays(int arr[], int subArrayLength, int index){
      if(index >= arr.length || (index + subArrayLength) > arr.length) 
        return;
      for(int i = index, j = subArrayLength; i < arr.length && j > 0; i++, j--){
        System.out.print(arr[i] + " ");
        sum += arr[i];
      }

      System.out.println();
      printSubArrays(arr, subArrayLength, index + 1);
      return;
    }
  
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      
      for(int subArrayLength = 1; subArrayLength <= arr.length; subArrayLength ++)
        printSubArrays(arr, subArrayLength, 0);

      System.out.println("Sum: " + sum);
    }
}