package Extends;

public class Animal {
    protected int id;
    protected int weight;
    protected int age;
    public String color;

    public Animal(int id, int weight, int age, String color) {
        this.id = id;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void GetVoice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BinaryTree" ;
    }
}
