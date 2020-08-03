package HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap data = new HashMap();
        HashMap dataPutAll = new HashMap();


        Student sidorov = new Student(100, "Sidorov");
        Student ivanov = new Student(1, "Ivanov");
        Student petrov = new Student(42, "Petrov");
        Student vinnik = new Student(100, "Vinnik");


        data.put(sidorov, "bad student");
        data.put(ivanov, "very good student");
        data.put(petrov, "so lazy");



        dataPutAll.put(sidorov, "bad student");
        dataPutAll.put(vinnik, "very good student");
        dataPutAll.put(petrov, "so lazy");


        System.out.println("Size of hashMap: " + data.size());
        System.out.println("Map is empty: "+data.isEmpty());
        System.out.println("Sidorov have a Map: "+data.contains(sidorov));

        System.out.println("Show work method REMOVE(sidorov): "+data.remove(sidorov));
        System.out.println("Show work method SIZE after method REMOVE " + data.size());

        System.out.println("Show work method CLEAR: ");
//        data.clear();
        System.out.println("Show work method CLEAR after method CLEAR: ");
//        data.clear();


        Student deansInput = new Student(42, "Petrov");
        System.out.println(data.get(deansInput));
        data.getValue(sidorov);
    }
}
