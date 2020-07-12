package Extends;

public class Main {

    public static void main(String[] args) {
        Cat cat =new Cat(1,"Bonya",true,3,1,"gray");
        cat.GetVoice();
        Dog dog = new Dog(1,"Badi",true,15,12,"black");
        dog.GetVoice();
        Hamster hamster = new Hamster(1,"Stepa",15,12,"white");
        hamster.GetVoice();
        Fish fish = new Fish(1,2,3,"silver");
        fish.GetVoice();
        Wolf wolf = new Wolf(1,true,3,5,"Gray");
        wolf.GetVoice();
        Lion lion = new Lion(1,true,5,4,"Red");
        lion.GetVoice();

        Giraffe giraffe = new Giraffe(1,5,7,"brown");
        giraffe.GetVoice();

        Crocodi crocodi = new Crocodi(1,true,50,5,"Green");
        crocodi.GetVoice();
        DogGuide dogGuide = new DogGuide(1,"Tedi",true,true,10,5,"white");
        dogGuide.GetVoice();

    }
}
