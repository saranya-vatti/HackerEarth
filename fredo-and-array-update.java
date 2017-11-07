package com.company;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            sum+=s.nextInt();
        }
        if(sum%N==0) {
            System.out.println((sum/N) + 1);
        } else {
            System.out.println(((int)Math.ceil(sum/N)) + 1);
        }
    }
}
