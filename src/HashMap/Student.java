package HashMap;

public final class Student {
    private final int id;
    private final String lastname;


    public Student(int id, String lastname){
        this.id = id;
        this.lastname = lastname;

    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public int hashCode(){
        return id;
    }


    @Override
    public boolean equals(Object o){
        Student other = (Student) o;
        return id == other.id;
    }
}
