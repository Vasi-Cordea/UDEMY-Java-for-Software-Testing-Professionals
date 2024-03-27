package FeaturesOfOOP.Abstract;
// parent class give the option to the child to ussame methods
public class Dog extends Animal{
    //you cannot instantiate an abstract class:  Animal animal = new Animal();
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.legs();

    }
    @Override
    public void sound(){
        System.out.println("Dog barks");


    }
}
