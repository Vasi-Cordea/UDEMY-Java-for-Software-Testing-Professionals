package OOP.AccessModifiers.math;

public class Addition {
    int a = 10;
    int b = 15;

    Addition(){
        System.out.println("I am inside the class");
    }

    void add() {
        System.out.println("I am inside Addition class");

    }

    public static void main(String[] args) {
        Addition addi = new Addition();
        addi.add();
    }
}

