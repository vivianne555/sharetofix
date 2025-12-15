package org.example;

public class DataType {
    public static void swapNumber(){
        int  a = 5;
        int  b = 6;
       a = a + b;
       b = a - b;
       a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
