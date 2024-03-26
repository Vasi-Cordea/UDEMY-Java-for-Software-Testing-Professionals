package FeaturesOfOOP.MethodOverriding;

public class LivingBeingOvr {
    protected String eyes = "twoEyes";
    protected String legs = "running";

    // protected used to give acces only to classes that inherit this class,security
    protected void seeing(){
        System.out.println("Eyes are used to see, parent class method ");

    }
    protected void run (){
        System.out.println("Legs are used to run, parent class method ");

    }

}
