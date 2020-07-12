package LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        /*System.out.println("Collection contains 8: " + linkedList.contains(8));
        System.out.println(linkedList.toString());
        System.out.println("Collection is empty: " + linkedList.isEmpty());

        linkedList.add("First");
        linkedList.add(2);
        linkedList.add(3.3);
        linkedList.add("Thursday");
        linkedList.add(new BigDecimal("5.55555"));

        System.out.println(linkedList);
        System.out.println("Collection is empty: " + linkedList.isEmpty());

        System.out.println("null: " + linkedList.remove(null));
        System.out.println("Remove Second: " + linkedList.remove("Second"));
        System.out.println("Remove 3.3: " + linkedList.remove(3.3));

        linkedList.add("BinaryTree");
        linkedList.add("word");
        linkedList.add("hello");
        linkedList.add("hello");
        linkedList.add("hello");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println("Size of collection: " + linkedList.size());

        System.out.println("Remove hello: " + linkedList.remove("hello"));
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println("Clear: " + linkedList);
        System.out.println("Size of collection: " + linkedList.size());*/

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);


        System.out.println(linkedList.toString());
        System.out.println("Size of collection: " + linkedList.size());
        linkedList.toArray();

        linkedList.iterator();
    }
}
