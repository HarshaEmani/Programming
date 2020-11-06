import java.util.ArrayList;
import java.util.Scanner;

class StringCompress {

    public static ArrayList<Character> intToChar(ArrayList<Character> arr, int tempCount) {
        char[] temp = Integer.toString(tempCount).toCharArray();
        for (int j = 0; j < temp.length; j++)
            arr.add(temp[j]);

        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str1 = s.nextLine();
        char str[] = str1.toCharArray();

        ArrayList<Character> arr = new ArrayList<Character>();

        int k = 0, tempCount = 1, totalCount = 0;

        for (int i = 0; i < str.length; i++) {

            if (i == 0) {
                arr.add(str[i]);
                continue;
            }

            if (arr.get(arr.size() - 1).equals(str[i])) {
                tempCount++;

                if (i == str.length - 1)
                    arr = intToChar(arr, tempCount);
            } else {
                arr = intToChar(arr, tempCount);

                //totalCount += tempCount;
                arr.add(str[i]);
                tempCount = 1;

                if (i == str.length - 1)
                    arr = intToChar(arr, tempCount);
            }
        }

            for (char m : arr)
                System.out.print(m);
    }
}
