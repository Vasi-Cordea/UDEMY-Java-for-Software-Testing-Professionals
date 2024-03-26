package FeaturesOfOOP.methodOverload;

public class Parameter3 {
// overload by changing data type parameters in each method

    void parameters(int num) {  // No parameters
        System.out.println("This method has no parameter");

    }

    void parameters(String name) {
        System.out.println("single parameter");
    }

    void parameters() {
        System.out.println("double parameter");
    }

    public static void main(String[] args) {

        Parameter3 par = new Parameter3();


    }


}