package com.company.es3;

public class Varargs {

    public static int sumNumber(int ... numbers){
        int sum=0;

        for(int x: numbers){
            sum+=x;
        }
        return sum;
    }
}