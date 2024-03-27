package FeaturesOfOOP.Abstract.Interface2;
// after created when hovering over Learning it will show implement.. that will add override methods
public class Demo implements Learning{
    public static void main(String[] args) {

       // Demo.number ==87;      // it cannot be done! number = final
        System.out.println(Demo.number);

        Demo demo = new Demo();
        demo.method1();
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
