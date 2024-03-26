package FeaturesOfOOP.methodOverload;

public class Parameter2 {
// overload by changing again data type parameters in each method

    void parameters(int num, String abc) {  // No parameters
        System.out.println("This method has no parameter");

    }

    void parameters(String abc, int num) {
        System.out.println("single parameter");
    }

    void parameters() {
        System.out.println("double parameter");
    }

    public static void main(String[] args) {

        Parameter2 par = new Parameter2();


    }


}