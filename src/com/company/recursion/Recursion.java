package com.company.recursion;

public class Recursion {

    public static void reduceByOne(int n){
        if (n >= 0){
            reduceByOne(n-1);
        }
        System.out.println(n);
    }
}
