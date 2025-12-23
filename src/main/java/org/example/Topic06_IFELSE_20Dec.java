package org.example;

import java.util.Scanner;

public class Topic06_IFELSE_20Dec {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
////            // BT1: nhập số nguyên n, n chắn => hiển thị "n là số chẵn"
////           // n lẻ => hiển thị n là số lẻ
//            if( n % 2 == 0) {
//                System.out.println("n là số chẵn");
//            } else {
//                System.out.println("n là số lẻ");
//            };
////            //BT2: a >= b => "a > = b"
////            // a < b => "a < b"
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if( a >= b) {
//                System.out.println("a lớn hơn hoặc bằng b");
//            }
//            else{
//                System.out.println("a nhỏ hơn b");
//            };
//            // BT3: nhập tên 2 người kiểm tra xem nó giống nhau không
            String name1 = String.valueOf(sc.nextLine());
            System.out.println("name1 = "+ name1);
            String name2 = String.valueOf(sc.nextLine());
            System.out.println("name2 = "+ name2);
            if (name1.equals(name2)){
                System.out.println("Hai người giống nhau <3");
            } else{
                System.out.println("Hai người không giống nhau");
            };
            //BT4: Viết chương trình nhập từ bàn phím 3 số nguyên.
            // Sau đó hiển thị lên màn hình số lớn nhất trong 3 số này
            //Ví dụ nếu bạn nhập:473
            //Màn hình sẽ hiển thị ra: 7
            int m = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();
            if(m > l && m > h) {
                System.out.println(m);
            } else if (l < h && l > m){
                System.out.println(l);
            } else if (h > l && h > m){
                System.out.println(h);
            }
    }
}
