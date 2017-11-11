import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String S = br.readLine();

            int out_ = Solve(S);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int Solve(String S){
        // Write your code here
        char[] arr = S.toCharArray();
        int cost = 0;
        for(int i=0;i<S.length()/2;i++) {
            int bigger = Math.max(arr[i], arr[arr.length-i-1]);
            int smaller = Math.min(arr[i], arr[arr.length-i-1]);
            if(bigger!=smaller) cost+=smaller-'a'+1;
        }
        return cost;
    }
}