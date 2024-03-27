package FeaturesOfOOP.Final;

public class Employee {
    final String EMPPLOYEE_ID; // blank final variable
    String name;
    Employee(String EMPPLOYEE_ID, String name){

        this.EMPPLOYEE_ID= EMPPLOYEE_ID;
    }
    public static void main(String[] args) {
Employee emp = new Employee("83863636", "Mark");
        System.out.println(emp.name + "-" + emp.EMPPLOYEE_ID);
    }
}
