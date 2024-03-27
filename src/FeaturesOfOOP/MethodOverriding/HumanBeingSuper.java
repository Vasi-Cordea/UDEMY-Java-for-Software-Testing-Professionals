package FeaturesOfOOP.MethodOverriding;

import FeaturesOfOOP.LivingPack.LivingBeing;

public class HumanBeingSuper extends LivingBeingOvr {
    // same method name as in LivBeingOver
    protected void run() { // over - ridden class
        System.out.println("I use two legs only, overriding method");

    }
// super is calling the parent keyword method run() while overriden
    public void demo(){

        super.run();
    }
    public static void main(String[] args) {
        HumanBeingSuper hb = new HumanBeingSuper();
        hb.demo();

    }
}

