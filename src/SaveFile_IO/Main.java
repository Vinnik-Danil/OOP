package SaveFile_IO;

import java.io.*;
import java.util.ArrayList;

class Main {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String filename = "text.txt";
        // создадим список объектов, которые будем записывать
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople = new ArrayList<Person>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            newPeople=((ArrayList<Person>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }
}
class Person implements Serializable{

    private String name;
    private int age;
    private double height;
    private boolean married;

    Person(String n, int a, double h, boolean m){

        name=n;
        age=a;
        height=h;
        married=m;
    }
    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}

//    private String surname;
//    private int[] marks;
//    private boolean[] presence;
//
//    private int Quany_OF_LECTION=32;
//    public  Person(String surname) {
//        this.surname= surname;
//        marks = new int[Quany_OF_LECTION];
//        presence = new boolean[Quany_OF_LECTION];
//    }
//    String getName() {return surname;}
//
//    int[] getMarks() {
//        return marks;
//    }
//    boolean[] getPresence(){return presence;}
}




