package Studens;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    public int[] marks;
    public boolean[] presence;
    private int id;
    private int Quany_OF_LECTION=32;
        public  Student(int key, String surname) {
            super(surname);
            this.id =id;
            marks = new int[Quany_OF_LECTION];
            presence = new boolean[Quany_OF_LECTION];

        }
    @Override
    public void GetVoice() {
        System.out.println("Hi "+toString() + surname );
    }
}