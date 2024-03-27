package FeaturesOfOOP.This;

public class Studenta {
    String name;
    int age;
    char gender;

    Studenta(){
        this("Name", 38, 'M');
       // System.out.println("I am no argument constructor");
    }

    Studenta(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public static void main(String[] args) {


        Studenta stu1 = new Studenta();
     System.out.println(stu1.name + "-" + stu1.age + "-" + stu1.gender);
       // Studenta stu2 = new Studenta("Linda", 25, 'F');
        //System.out.println(stu2.name + "-" + stu2.age + "-" + stu2.gender);


    }
}
