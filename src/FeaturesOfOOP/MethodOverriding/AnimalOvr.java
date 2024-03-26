package FeaturesOfOOP.MethodOverriding;

public class AnimalOvr extends LivingBeingOvr{

    protected void run(){
        System.out.println("this being  uses 4 legs");



    }
    public static void main(String[] args) {
        AnimalOvr dog= new AnimalOvr();
        dog.run();


    }
}
