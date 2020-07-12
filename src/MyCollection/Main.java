package MyCollection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        MyCollection collection_1 = new MyCollection();
//
//        collection.add("hello");
//        collection.add("bye");
//        collection.remove("hello");
//        System.out.println(collection.size());
//
//        collection.add("431");
//
//        collection_1.add("aaa");
//        collection_1.add("bbb");
//        collection_1.add("431");
//
//        System.out.println(collection.size());
//        collection.clear();
//        System.out.println(collection.getCollec());
//
//        System.out.println(collection.size());
//        collection.iterator();
//        System.out.println(collection.getCollec());
//
//        System.out.println(collection.size());
//
//        System.out.println(collection.isEmpty());
//
//        collection.clear();
//        System.out.println(collection.getCollec());
//
//        collection.add("2221");
//        collection.add("222");
//        collection.add("322");
//        collection.add("431");
//        System.out.println(collection.getCollec());
//
//        System.out.println(collection.addAll(collection_1));
//        System.out.println(collection.getCollec());
//
//        collection.remove("222");
//        System.out.println(collection.getCollec());
//
//        System.out.println(collection.remove("1234135"));
//
//        System.out.println( collection.getCollec());
//        System.out.println( collection_1.getCollec());
//
//        collection.contains("222");
//
//        System.out.println(collection.removeAll(collection_1));
//
//        System.out.println( collection.getCollec());
//        System.out.println( collection_1.getCollec());
//
//        System.out.println(collection.containsAll(collection_1));
//        System.out.println(collection.retainAll(collection_1));
//
//        System.out.println( collection.getCollec());
//        System.out.println( collection_1.getCollec());
        MyCollection container = new MyCollection();
        container.add(1);
        container.add(2);
        container.clear();
        System.out.println(Arrays.toString(container.toArray()));

        MyCollection myCollection = new MyCollection();

        myCollection.add("hello");
        myCollection.add("bye");
        myCollection.remove("hello");
        System.out.println(Arrays.toString(myCollection.toArray()));
    }
}
