/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
         */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int[] freq = new int[63]; //space, 0-9, A-Z, a-z
        char[] arr = new char[line.length()];
        for(int i=0;i<arr.length;i++)  {
            if(arr[i]==' ') freq[0]++;
            if(0 <= arr[i] && arr[i] <= 9) freq[arr[i]-0+1]++;
            if('A' <= arr[i] && arr[i] <='Z') freq[arr[i]-'A'+11]++;
            if('a' <= arr[i] && arr[i] <='z') freq[arr[i]-'a'+37]++;
        }
        
    }
}
