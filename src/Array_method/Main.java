package Array_method;

public class Main {
    public static void main(String[] args) {
        Mas mas = new Mas();
        mas.add(2);
        mas.add(4);
        mas.add(6);
        mas.add(8);
/*
*
*
*
*
*
*
* */
        mas.add(6);
        mas.add(8);

        System.out.println(mas.isEmpty());
        System.out.println(mas.masToString());
        System.out.println(mas.numbOfFind(1));
        mas.getMas();
        System.out.println(  mas.getSize());
        mas.deleteByIndex(15);
        mas.getMas();
        mas.contains(3);
        mas.sort();
        mas.getMas();

        System.out.println("////////////");

        mas.getMas();
        System.out.println(mas.numbOfindex(4));
    }
}
