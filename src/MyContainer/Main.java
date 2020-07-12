package MyContainer;


public class Main {
    public static void main(String[] args)  {
//        MyCon myCon = new MyCon();
//        MyCon myCon1= new MyCon();
//        myCon.add("123");
//        myCon.add("213");
//        myCon.add("15324");
//        myCon.remove(15324);
//        System.out.println(myCon.size());
//
//        myCon1.add("123");
//        myCon1.add("213");
//        myCon1.add("15324");

//        System.out.println( myCon.remove(null));
//        System.out.println(myCon.remove("213"));
//        System.out.println(myCon.toString());
//        System.out.println(myCon.containsAll(myCon1));
//
//        myCon.clear();
//        System.out.println(myCon);
//
//        myCon.add("213");
//        myCon.add("15324");
//        System.out.println(myCon.toString());
//        System.out.println(myCon.isEmpty());
//        myCon.addAll(myCon1);
//        System.out.println(myCon.toString());

//        System.out.println(myCon.removeAll(myCon));
//        System.out.println(myCon.toString());

        MyCon myCon = new MyCon();
        myCon.add(1);
        myCon.add(2);
        myCon.add(3);


        MyCon myCon2 = new MyCon();
        myCon2.add(1);
        myCon2.add(2);
        System.out.println(myCon2.toString());


        System.out.println( myCon.containsAll(myCon2));
    }
}
