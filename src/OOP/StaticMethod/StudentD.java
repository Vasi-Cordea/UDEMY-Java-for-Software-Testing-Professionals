package OOP.StaticMethod;

public class StudentD {

//instamce variables (static variables can be accessed directly without creating the object)
   static  String name = "Tom";
    int age = 10;
    char gender = 'M';
    static String country = "USA";
    StudentD(){ // Constructor without parameters

    }


    /* constructor method, has same name as class, c meathod has no return type */
    StudentD(String name1, int age1, char gender1) {   // constructor with parameters
        name=name1;
        age=age1;
        gender=gender1;
       // System.out.println("This is a constructor");
    }

    public static void main(String[] args) {
      country = "UK";
        //to access instance variables here you have to make them static

        StudentD stu = new StudentD("Mark",28,'M');
        stu.country =  "France";
        StudentD stu6 = new StudentD("Linda",25,'F');

        System.out.println(stu.name +"-"+stu.age+"-"+stu.gender + "-"+ stu.country);

        System.out.println(stu6.name +"-"+stu6.age+"-"+stu6.gender + "-"+ stu6.country);


    }

}
