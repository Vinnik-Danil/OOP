package Stream;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов"));
        students.add(new Student("Петров"));
        students.add(new Student("Ярош"));
        students.add(new Student("Дериш"));
        students.add(new Student("Михайловская"));
        students.add(new Student("Комлевая"));

        StudentSearch studentSearch = new StudentSearch(students);

        for (Student student : studentSearch.getList().get()) {
            System.out.println(student.getSurname());
        }
    }
}
