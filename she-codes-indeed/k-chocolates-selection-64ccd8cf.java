import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String [] temp = br.readLine().trim().split(" ");
         int K = Integer.parseInt(temp[0]);
         int N = Integer.parseInt(temp[1]);
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         long out_ = Solve(K, arr);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long Solve(int K, int[] arr){
        // //Write code here
        long sum=0;
        if(K==arr.length) {
            for(int i=0;i<arr.length;i++) {
                sum+=arr[i];
            }
            return sum;
        }
        for(int i=0;i<K;i++) {
            sum+=arr[i];
        }
        int lastFromStart = K-1;
        int firstFromEnd = arr.length - 1;
        long rollingSum = sum;
        for(int i=0;i<K;i++) {
            rollingSum = rollingSum - arr[lastFromStart] + arr[firstFromEnd];
            if(rollingSum>sum) sum = rollingSum;
            lastFromStart--;
            firstFromEnd--;
        }
        return sum;
    }
}