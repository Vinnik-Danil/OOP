package Extends;

public class Giraffe extends Animal{

    public Giraffe (int id, int weight, int age, String color){
        super(id,weight,age,color);
    }

    @Override
    public void GetVoice() {
            System.out.println(toString() + " am is giraffe");
    }
}
