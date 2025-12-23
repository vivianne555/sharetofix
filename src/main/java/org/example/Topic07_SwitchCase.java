package org.example;

import java.util.Scanner;

public class Topic07_SwitchCase {
    //1 - Viết chương trình in ra tên các chữ số nhập vào bằng tiếng Anh - các số này là 1 trong các số nguyên từ 1 đến 10.
//Ví dụ gán a bằng 1 thì chương trình chạy sẽ in ra "One", gán a = 2 thì in ra "Two"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        switch (a) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//            default:
//                System.out.println("Error");
//                break;
//
//        }
//        Nhập vào 2 số nguyên a và b
//        - nhập vào phép toán +, -, *, /, %
//Thực hiện tính toán theo phép toán nhập vào với hai số a, b và in ra kết quả
//        System.out.print("Nhập vào số nguyên b: ");
//        int b = sc.nextInt();
//        System.out.print("Nhập vào số nguyên c: ");
//        int c = sc.nextInt();
//        System.out.print("Nhập vào phép toán : ");
//        String operator = sc.next();
//        switch (operator){
//            case "+":
//                System.out.println("Tổng b + c là: "+ (b + c));
//                break;
//            case "-":
//                System.out.println("Hiệu b - c là "+ (b - c));
//                break;
//            case "*":
//                System.out.println("Tích b*c là "+ (b * c));
//                break;
//            case"/":
//                System.out.println(" Thương b /c = "+ (b / c));
//                break;
//            default:
//                System.out.println("Error "+ operator);
//                break;
//        }
//3 - Viết chương trình nhập vào một tháng - hiển thị số ngày của tháng đó
//Nhập tháng 1 hiển thị ra màn hình là 31
//Nhập tháng 2 hiển thị ra màn hình là 28
//• Nhập tháng 11 hiển thị ra màn hình là 30
        System.out.print("Please input month : ");
        String i = sc.next();
        switch (i) {
            case "1":
                System.out.println("31 days");
                break;
            case "3":
                System.out.println("30 days");
                break;
            case "2":
                System.out.println("28 days");
                break;
            default:
                System.out.println("Error ");
                break;
        }
    }
}
