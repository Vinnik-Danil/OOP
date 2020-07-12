package Studens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods {
    public static void addStudent(int key, String newStudentName, Student[] students) {
        int position=-1;
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null){
                position=i;
                break;
            }
        }
        if(position==-1){
            System.out.println("not add student"+newStudentName);
            return;
        }

        students[position]= new Student(key,newStudentName) ;
    }
    public static void getInf(Student[] students){
        System.out.println("№ \tFIO \tMarks");
        for (int i = 0; i <students.length ; i++) {
            if(students[i]==null){continue;}
            System.out.println(i +"\t" + students[i].surname+"\t"+ Arrays.toString(students[i].marks));
        }
    }
    public static void clearList(Student[] students){
        for (int i = 0; i <students.length ; i++) {
            students[i].surname = null;
            students[i].marks = null;
            students[i].presence=null;
            if (students[i].surname == null && students[i].marks == null && students[i].presence==null) {
                continue;
            }
            System.out.println(students[i].surname + "\t" + Arrays.toString(students[i].marks)+ "\t" + students[i].presence);
        }

        System.out.println("Array is clear!");

    }
    public static void deleteBySurname (String Delete, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] !=null && students[i].surname.equalsIgnoreCase(Delete)) {
                students[i] = null;
            }
        }
    }
    public static void addMarks(Student[]students, String surname, int marks, int lesson) {
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null && students[i].surname.equalsIgnoreCase(surname)){
                students[i].marks[lesson-1]= marks;
            }
        }
    }
    public static void contains(String newContains, Student[] students) {
        int position=-1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].surname==newContains){
                position=i;
                System.out.println("Student "+newContains+" have a group!");
                break;
            }
        }
        if(position==-1){
            System.out.println("not add student"+newContains);
            return;
        }

    }
    public static void sort(ArrayList listOfsurname, int[][] marks) {
        Collections.sort(listOfsurname);
        int pos=-1;
        System.out.println("№ \tFIO \tMarks");
        for (int i =0; i <listOfsurname.size() ; i++) {
            if (listOfsurname.get(i) == null) {
                pos=i;
                continue;
            }
            System.out.println(i + "\t" + listOfsurname.get(i) + "\t"+Arrays.toString(marks[i]));

        }
    }


}
