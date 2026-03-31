package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Review_13th01 {
    public static void main(String[] args) {
//        int a = 6;
//        int b = 2;
//        int P1 = a + b;
//        int P2 = a - b;
//        int P3 = a * b;
//        System.out.println("a + b = " + P1);
//        System.out.println("a - b = " + P2);
//        System.out.println("a * b = " + P3);
//        double c = 7.5;
//        double d = 3.8;
//        double Area = c * d;
//        System.out.println("Area =" + Area);
//        String name = "Automation Testing";
//        System.out.println("Hello "+ name);
//Operator bai tap
        Scanner sc = new Scanner(System.in);
//        String P1 = sc.nextLine();
//        int P2 = sc.nextInt() + 15;
//        System.out.println("After 15 years, Age of "+ P1 + "will be "+ P2);
//        B2:
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int P1 = b;
//        int P2 = a;
//        System.out.println( "After swaping then a= " + P1 + " & b = " + P2 );
//        B3:
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//                System.out.println(a > b);
//                if B1
//        int n = sc.nextInt();
//        if(n % 2 == 0 ){
//            System.out.println(n + " là số chẵn");
//
//        } else {
//            System.out.println( " n là số lẻ ");
//        }
        //B2
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if ( a >= b ){
//            System.out.println(" a >= b");
//        } else{
//            System.out.println("a < b");
//        }
        //B3
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        if ( a.equals(b)){
//            System.out.println("cung ten");
//        } else {
//            System.out.println("khac ten ");
//        }
        //B4
//        System.out.print( "a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//        System.out.print("c = ");
//        int c = sc.nextInt();
//        if (a > b && a > c){
//            System.out.println( "a là số lớn nhất" );
//        }else if (b > a && b >c ){
//            System.out.println("b là số lớn nhất");
//        } else if ( c > a && c > b){
//            System.out.println("c là số lớn nhất");
//        };
        // cách 2
//        System.out.print("Nhap a = ");
//        int max = sc.nextInt();
//        for (int i = 2; i <= 3; i++) {
//            System.out.print("Nhập số thứ " + i+ " ");
//            int n = sc.nextInt();
//            if ( n > max) {
//                max = n;
//            }
//        }
//        System.out.println("so lon nhat: "+ max);
        //B5 : a có nằm 10-100 không?
//        System.out.print(" nhập a = ");
//        double a = sc.nextDouble();
//        if ( a >= 10 || a <= 100 ){
//            System.out.println("a nằm trong khoảng 10-100 ");
//        } else{
//            System.out.println( "a không nằm trong khoảng 10-100");
//        };
        // b6: 6 - Viết chương trình nhập vào điểm của sinh viên. Hãy kiểm tra xem điểm nhập vào tương ứng với loại xếp hạng nào
        //0< 5 D
        //5 < 7.5 C
        //7.5 < 8.5 B
        //8.5 - 10 A
//        System.out.print("Nhap diem: ");
//        double a = sc.nextDouble();
//        if(0 < a && a <= 5){
//            System.out.println("D");
//        } else if (5 < a && a <= 7.5){
//            System.out.println( "C");
//        } else if (7.5< a && a <= 8.5){
//            System.out.println("B");
//        }else if (8.5 < a && a < 10 ){
//            System.out.println("A");
//        };
        // B7 nhap 1 thang hien thi so ngay thang do
//        System.out.print("nhap thang: ");
//        int a = sc.nextInt();
//        if( a == 4 || a == 6 || a == 9 || a == 11 ){
//            System.out.println( "30 ngay");
//        } else if ( a == 2){
//            System.out.println("28 ngay ");
//        } else if ( a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12){
//            System.out.println("31 ngay");
//        };
        //cach 2 vong for
//       int a = sc.nextInt();
//        for( int i = 1; i < 13; i++){
//            if (i == a){
//                if( i == 4 || i == 6 || i == 9 || i == 11){
//                    System.out.println( "30 ngay");
//                }
//                else if (i == 2){
//                    System.out.println("28 ngay");
//                }
//                else{
//                    System.out.println("31 ngay");
//                }
//                break;
//            }
//        }
        //Switch case B1: 1-10 đếm ra one-ten
//        int number = 10;
//        switch(number){
//            case 1 :
//                System.out.println("one");
//            break;
//            case 2 :
//                System.out.println("two");
//                break;
//            case 3 :
//                System.out.println("three");
//                break;
//            case 4 :
//                System.out.println("four");
//                break;
//            case 5 :
//                System.out.println("five");
//                break;
//            case 6:
//                System.out.println("six");
//                break;
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        String operator = sc.next();
//
//        switch (operator){
//            case "+":
//                System.out.println("a+ b = "+ (a + b));
//                break;
//            case "-":
//                System.out.println(" a - b = "+ (a - b));
//                break;
//            case "x":
//                System.out.println("a x b = "+ (a*b));
//                break;
//            case "/":
//                System.out.println("a / b = "+ (a/b));
//                break;
//            default:
//                System.out.println("vui lòng nhập đúng yêu cầu!");
//                break;
//        }
        // BT3: viết 1 tháng show số ngày của tháng đó
        int a = sc.nextInt();
        switch(a){
            case 1,3,5,7,8,10,12:
                System.out.println("tháng "+ a + " có 31 ngày!");
                break;
            case 2:
                System.out.println("tháng "+ a + " có 28 ngày");
                break;
            case 4,6,9,11:
                System.out.println("tháng "+ a + " có 30 ngày");
                break;
            default:
                System.out.println("vui lòng nhập thông tin hợp lệ!");
        }
    }
}