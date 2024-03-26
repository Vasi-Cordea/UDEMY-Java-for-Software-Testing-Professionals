package FeaturesOfOOP.HumanPack;

import FeaturesOfOOP.LivingPack.LivingBeing;

public class HumanBeing extends LivingBeing {
    public String hands;

            public void pickup(){

                System.out.println("Hand wash");
                System.out.println(eyes);

                seeing();
                run();
            }
    public static void main(String[] args) {
HumanBeing hb = new HumanBeing();
hb.pickup();
hb.seeing();
hb.run();

    }
    }

