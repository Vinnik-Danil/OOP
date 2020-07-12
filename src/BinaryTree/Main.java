package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree set = new BinaryTree();
        BinaryTree set1 = new BinaryTree();
        BinaryTree set2 = new BinaryTree();

        set.add(1);
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(7);
        set.add(0);
        set.add(3);
        set.toString();
        System.out.println("SIZE: "+set.size());
        System.out.println("Method contains: " + set.contains(5));
        System.out.println("IsEmpty: " + set.isEmpty());
        set.remove(7);
        System.out.println("Show working method remove: ");
        set.toString();
        System.out.println("Method size after call method remove: "+set.size());


        set.clear();
        set1.clear();


        set.add(0);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(7);


        set1.add(11);
        set1.add(15);
        set1.add(20);
        set1.add(52);

        set2.add(13);
        set2.add(12);
        set2.add(10);
        set2.add(17);
        set2.add(19);

        set.toString();
        System.out.println("SET1" + set1 );
        set1.toString();
        System.out.println("SET2" + set2 );
        set2.toString();

        System.out.println(set1.retainAll(set2));
        System.out.println("Show working method " + set1);


    }
}
