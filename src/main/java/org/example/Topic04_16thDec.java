package org.example;

import java.util.Scanner;

public class Topic04_16thDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int tuoi = sc.nextInt();
       int after = tuoi + 15;
        System.out.println("After 15 years, age of " + ten + " will be " + after);
        //BT2: Cho 2 biến kiểu số nguyên a và b
// - viết chương trình hoán đổi giá trị của biến a và biến b.
// Sau đó hiển thị ra màn hình
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping then a = " + a + ", b = " + b);
        //BT3: 3 - Cho hai biến a và b kiểu số nguyên
        // - viết chương trình hiển thị ra màn hình true nếu a lớn hơn b, ngược lại hiển thị ra false.
        int c = sc.nextInt();
        int d = sc.nextInt();
        if( c > d ){
            System.out.println("TRUE");
        }
        if ( c < d) {
            System.out.println("FALSE");
        }
    }
}


