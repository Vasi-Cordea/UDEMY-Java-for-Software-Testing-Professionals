package FeaturesOfOOP.LivingPack;

public class LivingBeing {
    protected String eyes = "twoeyes";
    protected String legs = "running";

    // protected used to give acces only to classes that inherit this class,security
    protected void seeing(){
        System.out.println("Eyes are used to see");

    }
    protected void run (){
        System.out.println("Legs are used to run");

    }

}
