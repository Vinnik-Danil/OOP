package SimpleNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Function f = new Function();
        list.add(2);
        list.add(75);
        list.add(124);
//        list.add(-1);
//        list.add(-99);
//        list.add(241);
//        list.add(-12412);
//        list.add(2142);
//        list.add(756);
        System.out.println("Average sum in list: "+f.double_mean(list));
        System.out.println("Pow sum in nomber of list: " + f.returnPositiveNumb(list));
    }
}
