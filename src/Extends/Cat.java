package Extends;

public class Cat  extends Animal{
    boolean isVaccinated;
    String name;
    public Cat(int id, String name, boolean isVaccinated, int weight, int age, String color){
        super(id,weight,age,color);
        this.name=name;
        this.isVaccinated=isVaccinated;

    }

    @Override
    public void GetVoice() {
        System.out.println( toString() +" my name "+name+ "\nMay ");
    }
}
