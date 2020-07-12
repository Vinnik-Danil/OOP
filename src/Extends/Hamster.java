package Extends;

public class Hamster extends Animal{
    String name;
    public Hamster (int id, String name, int weight, int age, String color){
        super(id,weight,age,color);
        this.name=name;
    }

    @Override
    public void GetVoice() {
        System.out.println( toString() +" my name "+name+ "\n ");
    }

}
