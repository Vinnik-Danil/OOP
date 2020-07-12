package Extends;

public class Crocodi extends Animal {
    boolean isPredator;
    public Crocodi (int id, boolean isPredator, int weight, int age, String color){
        super(id,weight,age,color);
        this.isPredator= isPredator;

    }

    @Override
    public void GetVoice() {
        if (isPredator == true) {
            System.out.println(toString() + " am is predator" + " and i am angry ");
        } else {
            System.out.println(toString() + "i am is crocodile");
        }
    }
}
