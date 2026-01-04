package org.example.Chat.Xpath;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

import static java.lang.Long.sum;

//1 - Viết chương trình nhập vào từ bàn phím số nguyên n và hiển thị ra các số từ 1 tới n mỗi số cách nhau bởi 1 khoảng trắng
//• Ví dụ nếu nhập n = 10 thì chương trình sẽ hiển thị ra: 12345678910
public class Topic08_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("Nhâp n: "+ n);
//        for (int i = 1 ; i <= n ; i++){
//            System.out.println(i+ " ");
//        }
        //• 2 - Cho số nguyên a và b được nhập vào từ bàn phím - hãy viết chương trình hiển thị
        // ra màn hình các số từ a tới b
//• Ví dụ nếu nhập a = 5 và b = 9 thì chương trình sẽ hiển thị ra màn hình:
//5 67 89
//        System.out.print("nhập a = ");
//        int a = sc.nextInt();
//        System.out.print("nhập b = ");
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++) {
//            System.out.print(i + " ");
//        }
        //• 3 - Viết chương trình in ra console tổng các số chẵn từ dãy số nguyên có độ lớn từ 1 đến 10
//Lưu ý kiểm tra một số chẵn bằng cách thực hiện phép chia dư số đó với 2 - nếu kết quả phép chia dư là 0
// thì đó là số chẵn
//        int[] list = {1,2,3,4,5,6,7,8,9,10};
//        int sum = 0;
//        for ( int i = 0; i < list.length ; i++){
//            if ( list[i] % 2 == 0) {
//                System.out.println(list[i] + " ");
//                sum = sum + list[i];
//            }
//        }
//        System.out.println("tổng số chẵn trong chuỗi = " + sum);
        //cách 2:
//        int sum = 0;
//        for (int i = 1; i <= 10; i++){
//            if ( i % 2 == 0){
//                System.out.println( i + " ");
//                sum = sum + i;
//            }
//        }
//        System.out.println("tổng số chẵn trong chuỗi = " + sum);
        //• 4 - Viết chương trình nhập vào từ bàn phím số nguyên a và b
//- hiển thị ra màn hình tổng các số từ a tới b
//        Ví dụ nếu nhập a = 5 và b = 9 thì chương trình sẽ hiển thị ra màn hình: 35
//        Giải thích: 5+6+7+8+9 =35
//        System.out.print("nhập a: ");
//         int a = sc.nextInt();
//        System.out.print(" nhập b: ");
//         int b = sc.nextInt();
//         int sum = 0;
//          for ( int i = a; i <= b; i++){
//              sum = sum + i;
//          }
//        System.out.println("tổng của a & b là: "+ sum);

//• 5 - Viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị ra tổng các số lẻ từ O tới n
//• Ví dụ nếu nhập n = 7 thì chương trình sẽ hiển thị ra màn hình: 16
//        o Giải thích: 1+3+5 +7=16
//        System.out.print("nhập n = ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for( int i = 1; i <= n ; i++){
//            if (i % 2 != 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

//• 6 - Viết chương trình nhập vào từ bàn phím số nguyên a và b. Sau đó hiển thị ra màn hình các số chia hết cho 3 từ a tới b:
//• Ví dụ nếu nhập a = 1 và b = 20 thì chương trình sẽ hiển thị ra màn hình: 369121518
//        System.out.print(" a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//        System.out.print("Các số chia hết cho 3 = ");
//        for (int i = a; i <= b; i++){
//            if(i % 3 == 0){
//                        System.out.print( " " + i);
//            }
//        }
//• 7 - Viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình n! (n giai thừa)
//• Ví dụ nếu nhập n = 5 thì chương trình sẽ hiển thị ra màn hình: 120
//• Giải thích: 1*2 *3 *4 *5 = 120
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
