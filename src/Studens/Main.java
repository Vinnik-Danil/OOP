package Studens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final int STUDENT_OF_GROUP=15;
        Student[] students = new Student[STUDENT_OF_GROUP];
        Methods methods = new Methods();
        ArrayList listOfsurname = new ArrayList();

        methods.addStudent(1,"Yarosh", students);
        methods.addStudent(2,"Vinnik", students);
        methods.addStudent(3,"Derish", students);

        methods.getInf(students);

        methods.addMarks(students,"Vinnik", 5,3);
        methods.getInf(students);

        methods.contains("Vinnik",students);
        System.out.println("------------------------");
        Student ivanov = new Student(1,"Ivanov");
        Student derish = new Student(2,"Derish");
        ivanov.GetVoice();
        derish.GetVoice();
        Techer sulevsky = new Techer("sulevsky");
        sulevsky.GetVoice();
    }

}

