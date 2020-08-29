package Stream;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //    public List<String> getSortedListOfNameOfStudentsList(List<Student> students){
//        return students.stream().sorted(Comparator.comparing(Student::getSurname)).filter(
//                student -> {
//                    Pattern pattern = Pattern.compile("[aeiou]");
//                    Matcher matcher = pattern.matcher(student.getSurname());
//                    int count = 0;
//                    while (matcher.find()) {
//                        count++;
//                    }
//                    return count > 3;
//                }
//        ).map(Student::getSurname).map(String::toUpperCase).collect(Collectors.toList());
//    }
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов"));
        students.add(new Student("Яготинский"));
        students.add(new Student("Попов-Зайцев"));
        students.add(new Student("Сидоров"));
        students.add(new Student("Дынин"));
        students.add(new Student("Ветровcкая"));
        students.add(new Student("Булгаков"));

        StudentSearch studentSearch = new StudentSearch(students);

        for (Student student : studentSearch.getList().get()) {
            System.out.println(student.getSurname());
        }
    }
}
