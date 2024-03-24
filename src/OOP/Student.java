package OOP;

public class Student {
String name;
int age;
char gender;

void setName(String name1) {
    name = name1;
}
    void setAge(int age1){
    age=age1;

    }
    void setGender (char gender1){
    gender=gender1;

}
public static void main(String[] args){
Student stu = new Student();
stu.setName("Mark");
stu.setAge(28);
stu.setGender('M');
       System.out.println(stu.name + "-"  + stu.age + "-" + stu.gender);

       Student stu2 = new Student();
       stu2.setName("Linda");
    stu2.setAge(24);
    stu2.setGender('F');
    System.out.println(stu2.name + "-"  + stu2.age + "-" + stu2.gender);


}
}
