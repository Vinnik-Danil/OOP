package LinkedList_implements_list;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("123");
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(new BigDecimal("5.55555"));


        System.out.println(linkedList);
        System.out.println("Size of collection: " + linkedList.size());

        linkedList.add("Danik");
        linkedList.add("Egor");
        System.out.println(linkedList);
        System.out.println("Size of collection: " + linkedList.size());

        System.out.println("Remove Danik: " + linkedList.remove("Danik"));
        System.out.println(linkedList);

        linkedList.sort(new Compator());
        System.out.println(linkedList);
    }
}
