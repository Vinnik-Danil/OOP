package Studens;

public class Techer extends Person {
    private int Quany_OF_LECTION=32;

    public  Techer(String surname) {
        super(surname);
        presence = new boolean[Quany_OF_LECTION];
    }
    @Override
    public void GetVoice() {
        System.out.println("BinaryTree "+toString() + surname );
    }
}
