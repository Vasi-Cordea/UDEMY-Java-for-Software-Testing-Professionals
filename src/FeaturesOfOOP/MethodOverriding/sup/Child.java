package FeaturesOfOOP.MethodOverriding.sup;

public class Child extends Parent {

    public Child(){

        // because super has a parameter here "I am super" is calling a method with parameters from Parent class
        super("I am super");
        System.out.println("I am a child class constructor");
    }
    public static void main(String[] args) {
        Child child = new Child();

    }
}

