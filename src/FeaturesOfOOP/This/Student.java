package FeaturesOfOOP.This;

public class Student {
    String name;
    int age;
    char gender;

    Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public static void main(String[] args) {


        Student stu1 = new Student("Mark", 28, 'M');
        Student stu2 = new Student("Linda", 25, 'F');
        System.out.println(stu2.name + "-" + stu2.age + "-" + stu2.gender);


    }
}
