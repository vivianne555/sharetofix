//• 7 - Viết chương trình hiển thị thông tin học sinh với
//Thuộc tính: ID, Name, Age, Score
//• Hàm khởi tạo giá trị cho các thuộc tính
//• Phương thức: displayed() - in ra console ID/ Name/ Age/ Score (Point)

package org.example;


public class Topic11_Array2 {
    int id;
    String name;
    int age;
    double score;
    public Topic11_Array2(int id,String name, int age, double score ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;

    }
    public void display() {
        System.out.println("ID: "+ id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: "+ score);
    }
    public static void main(String[] args){
        Topic11_Array2[] students = new Topic11_Array2[4];
        students[0] = new Topic11_Array2(123,"Linh",25,7);
        students[1] = new Topic11_Array2(1235,"Tuan",25,6.5);
        students[2] = new Topic11_Array2(9874,"Tuyet",29,10);
        students[3] = new Topic11_Array2(7654,"Dong",35,9.5);
        for( int i = 0; i < students.length ; i++){
            students[i].display();
            }
        }


    }
