package Extends;

public class Wolf extends Animal{
    boolean isPredator;
    public Wolf (int id, boolean isPredator, int weight, int age, String color){
        super(id,weight,age,color);
        this.isPredator= isPredator;

    }

    @Override
    public void GetVoice() {
        if (isPredator == true) {
            System.out.println(toString() + " am is predator" + " and i am angry ");
        } else {
            System.out.println("Yyyyy");
        }
    }
}
