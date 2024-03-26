package FeaturesOfOOP.methodOverload;

public class Parameter {

    void parameters() {  // No parameters
        System.out.println("This method has no parameter");

    }

    void parameters(int abc) {
        System.out.println("single parameter");
    }

    void parameters(int abc, String name) {
        System.out.println("double parameter");
    }

    public static void main(String[] args) {

        Parameter par = new Parameter();
        par.parameters(43, "Name");

    }


}