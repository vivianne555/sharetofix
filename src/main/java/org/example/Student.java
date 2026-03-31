package org.example;

public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }

    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Linh", 20);
        student[1] = new Student("Huong",25);
        student[2] = new Student("Quan",31);
        student[3] = new Student("Tuyet",29);
        for( int i = 0; i < 4; i++){
            student[i].display();
        }
    }
}

