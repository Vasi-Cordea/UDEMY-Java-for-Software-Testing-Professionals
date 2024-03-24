package OOP.Constructor;

public class StudentC {
    String name;
    int age;
    char gender;


    /* constructor method, has same name as class, c meathod has no return type */
    StudentC(String name1, int age1, char gender1) {
name=name1;
age=age1;
gender=gender1;
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {
        StudentC stu5 = new StudentC("Mark",28,'M');
        StudentC stu6 = new StudentC("Linda",25,'F');

        System.out.println(stu5.name +"-"+stu5.age+"-"+stu5.gender);
        System.out.println(stu6.name +"-"+stu6.age+"-"+stu6.gender);

            // stu5.StudentC();
        }


    }

