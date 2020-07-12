package Extends;

public class DogGuide extends Animal {
    boolean isVaccinated;
    boolean isTreined;
    String name;
    public DogGuide (int id, String name, boolean isVaccinated, boolean isTreined, int weight, int age, String color){
        super(id,weight,age,color);
        this.name=name;
        this.isVaccinated=isVaccinated;
        this.isTreined=isTreined;

    }

    @Override
    public void GetVoice() {
        System.out.println( toString() +" my name "+name+ " and i can take you home. ");
    }

}
