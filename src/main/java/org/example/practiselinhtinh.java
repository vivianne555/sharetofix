package org.example;

import java.util.Scanner;

public class practiselinhtinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        if ( a >0 && a < 5 ) {
//            System.out.println("Điểm D");
//        } else if ( a > 5 && a < 7.5 ) {
//            System.out.println("Điểm C");
//        } else if (a > 7.5 && a < 8.5 ) {
//            System.out.println("Điểm B");
//        } else if (a > 8.5 && a < 10) {
//            System.out.println("Điểm A");
//        }
        // nhập 1 tháng hiển thị số ngày của tháng đó
        // 30 ngày: 2, 4, 6,
        // 31 ngày:
        // 28 ngày:
        int b = sc.nextInt();

        if ( b == 4 || b == 6 || b == 8 || b == 10 || b == 12){
            System.out.println("30 ngày");
        } else if ( b == 1 || b == 3 || b == 5 || b == 7 || b == 9 || b == 11 ){
            System.out.println("31 days");
        } else if ( b== 2){
            System.out.println("28 days");
        }
        }
    }

