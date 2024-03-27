package FeaturesOfOOP.Abstract;
// parent class give the option to the child to us same methods
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");


    }
}