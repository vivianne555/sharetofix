package org.example;

import java.util.Scanner;

public class Review_17th01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BT1: nhập interger n in ra 1-> n có khoảng trắng
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            System.out.print( " "+ i);
       // }
// BT 2: nhập a & , các số từ a=> b?
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//    for(int i = a;i <= b;i++){
//        System.out.print(i+ " ");
//    }
// BT 3: in tổng số chẵn từ các dãy số nguyên 1-10
//        for(int i = 1; i <= 10; i++){
//            if (i % 2 == 0){
//                System.out.print(i+ " ");
//            }
//        }
//        BT4: in  a & b, in ra tổng a -> b
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= b; i++){
            if(i >= a){
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }
}
