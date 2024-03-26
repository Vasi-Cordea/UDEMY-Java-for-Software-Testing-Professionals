package OOP.Collections;

import java.util.ArrayList;

public class GetList {

    public static void main(String[] args) {
        int number = 10;

        ArrayList<Integer> alist = new ArrayList<Integer>();
        //alist = object variable
        alist.add(33);  //adds firsty item 33 to alist
        alist.add(68);
        alist.add(75);
        alist.add(66);
        alist.add(884);
        alist.add(35);
        alist.add(422);
        alist.add(95);
        alist.add(100);

        //alist.add(3, 999);
       // alist.remove(7);

//        System.out.println("size of list: "+ alist.size());
//        System.out.println(alist);
//        System.out.println(alist.get(1));

        //iterating
        for(int temp: alist){

            System.out.println("Items :" + temp);
        }
    }

}
