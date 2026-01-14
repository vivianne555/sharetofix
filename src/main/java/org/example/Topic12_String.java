package org.example;

import java.util.Scanner;

public class Topic12_String {
//1 - Cho 1 chuỗi được nhập vào từ bàn phím
// - hãy viết chương trình hiển thị ra màn hình số lượng các ký tự in hoa trong chuỗi
//Nếu bạn nhập = "Automation FC" thì màn hình sẽ hiển thị ra 3
//• Giải thích: trong chuỗi có 3 ký tự in hoa
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập chuỗi: " );
    String input = sc.nextLine();
    int count = 0;
    for(int i = 0; i < input.length(); i++){
        char c = input.charAt(i);
        if(Character.isUpperCase(c)){
            count = count + 1;
        }
    }
    System.out.println("kí tự in hoa = "+ count );
//    • 2 - Viết chương trình thực hiện các thao tác với chuỗi sau: Automation Testing 345 Tutorials Online: 789
//• Đếm số lượng kí tự là 'a' có trong chuỗi trên (kết quả = 3)
//Kiểm tra chuỗi có chứa từ 'Testing' hay ko (kết quả = true)
//Kiểm tra chuỗi có bắt đầu bằng từ 'Automation' hay ko (kết quả = true)
//Kiểm tra chuỗi có kết thúc bằng từ 'Online' hay ko (kết quả = false)
//Lấy vị trí của từ 'Tutorials' có trong chuỗi (kết quả = 19)
//Thay thế từ 'Online' bằng 'Offline' (kết quả = Automation Testing 345 Tutorials Offline 789)
//Đếm số lượng ký tự là số có trong chuỗi (kết quả = 6 số)

}
}
