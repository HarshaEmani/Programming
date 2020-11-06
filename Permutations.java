import java.io.*;

public class MyClass {
    
    public static StringBuffer swap(StringBuffer str, int i, int k){
        char j = str.charAt(i);
        
        str.setCharAt(i, str.charAt(k));
        str.setCharAt(k, j);
        
        return str;
    }
    
    public static void permutate(StringBuffer str, int n, int k, TreeSet<String> HS){
        if(k == n){
            HS.add(str.toString());
            return;
        }
            
        for(int i = k; i < n; i++){
            str = swap(str, i, k);
            permutate(str, n, k + 1, HS);
            str = swap(str, i, k);
        }
    }
    
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        while(t > 0){
            String str1 = s.next();
            StringBuffer str = new StringBuffer(str1);
            //char str[] = str1.toCharArray();
            int n = str1.length();
            
            TreeSet<String> HS = new TreeSet<String>();
            
            permutate(str, n, 0, HS);
            
            for(String k : HS){
                System.out.print(k + " ");
            }
            
            t--;
            System.out.println();
        }
    }
}
