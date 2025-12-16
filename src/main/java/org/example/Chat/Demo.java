package org.example.Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Hung");
        name.add("Trang");
        name.add("Huyen");
        name.add("Dung");
        name.add("Hoang");
        name.add("HOI");
        name.add("dONG");
        /* for (String i : name){
           if (i.equals("Linh")) {
             System.out.println("Ban gioi lam");
           break;
            } else {
                System.out.println("khong tra ra ket qua");
            };
        };*/
        for (int i= 0; i< name.size() ; i++) {
           if (name.get(i).equals("Hoang")){
               System.out.println("ban gioi lam");
           };
//           else {
//               System.out.println("khong co ket qua dung");
//           };
        };

    }
}
