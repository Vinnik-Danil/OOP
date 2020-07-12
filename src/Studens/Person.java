package Studens;

public class Person {
    protected String surname;
    protected boolean[] presence ;
    private int QUANTY_OF_LECTION=32;
    public Person(String surname) {
        this.surname = surname;
        presence=new boolean[QUANTY_OF_LECTION];
    }

    public void GetVoice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "my name " ;
    }
}
