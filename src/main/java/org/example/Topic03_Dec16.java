package org.example;
//a, b số nguyên; a= 6 b=2 => a + b = {P1}
public class Topic03_Dec16 {
    public static void main(String[] args) {

        int c = 6 ;
        int d = 2;
        //BT1: in ra + - * / a=6 b= 2
        System.out.println("c + d = " + (c + d));
        System.out.println("c + d = " + (c-d));
        System.out.println("tich cua c&d =" + (c*d));
        System.out.println("thuong cua c&d =" + (c/d));
// BT 2
        double a = 7.5;
        double b = 3.8;
        double dientichHCN = (a+b)/2;
        System.out.println("dien tich HCN =" + dientichHCN);
// BT3
        String name = "Automation Testing";
        System.out.println( "Hello " + name);

    }
}

