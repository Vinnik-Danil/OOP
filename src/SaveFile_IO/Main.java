package SaveFile_IO;

import Studens.Student;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter =new FileWriter("text.txt");
        FileReader fileReader = new FileReader("text.txt");
        Student ivanov = new Student(1,"ivanov");
        fileWriter.write(String.valueOf(ivanov.marks));
        fileWriter.close();

        fileReader.read();
    }
}
