package FeaturesOfOOP.MethodOverriding;

import FeaturesOfOOP.LivingPack.LivingBeing;

public class HumanBeingOvr extends LivingBeingOvr {
    // same method name as in LivBeingOver
    protected void run() { // over - ridden class
        System.out.println("I use two legs only, overriding method");

    }

    public static void main(String[] args) {
        HumanBeingOvr hb = new HumanBeingOvr();
        hb.run();

    }
}

