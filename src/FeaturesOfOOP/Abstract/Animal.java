package FeaturesOfOOP.Abstract;

public abstract class Animal {
    int eyes = 2;
    int legs = 4;
    String DSound;

    public void legs(){        // concrete class


        System.out.println("Animals have legs " + legs);
    }
    abstract public void sound();  // abstract method, has no actions
}
