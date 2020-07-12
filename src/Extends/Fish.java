package Extends;

public class Fish extends Animal{
    public Fish (int id,  int weight, int age, String color){
        super(id,weight,age,color);
    }

    @Override
    public void GetVoice() {
        System.out.println("----");
    }
}
