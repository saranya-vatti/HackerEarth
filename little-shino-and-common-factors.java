package com.company;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        Set<Long> factors = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(Math.min(a, b))+1; i++) {
            if(a%i ==0 && b%i==0) {
                factors.add((long)i);
            }
            if(a%i==0 && b%(a/i)==0) {
                factors.add((long)(a/i));
            }
            if(b%i==0 && a%(b/i)==0) {
                factors.add((long)b/i);
            }
        }
        System.out.println(factors.size());
    }
}
