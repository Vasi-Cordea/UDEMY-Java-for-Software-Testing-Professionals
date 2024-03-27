package FeaturesOfOOP.Encapsulation;

public class Daimon {

    public static void main(String[] args) {

        Encap encap = new Encap();

        // balance cannoyt be accessed as balance is private = encapsulation
     // uncomment to test:   encap.balance = 45;
        encap.setBalance(20);
    }


}
