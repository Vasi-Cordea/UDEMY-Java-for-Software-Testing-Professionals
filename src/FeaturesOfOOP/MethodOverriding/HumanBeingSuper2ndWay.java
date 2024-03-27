package FeaturesOfOOP.MethodOverriding;

public class HumanBeingSuper2ndWay extends LivingBeingOvr {
    public String legs = "4 legs";
    // same method name as in LivBeingOver
    protected void run() { // over - ridden class
        System.out.println("I use 2 legs only, Overriding method");

    }
// super is calling the parent keyword method run() while overriden
    public void demo(){
        System.out.println(super.legs);
        super.run();
    }
    public static void main(String[] args) {
        HumanBeingSuper2ndWay hb = new HumanBeingSuper2ndWay();
        hb.demo();

    }
}

