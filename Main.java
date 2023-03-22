import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Person person = new Person("Alice");
        File file = new File("person.txt");

        // Write
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        PersonOutputStream personOutputStream = new PersonOutputStream(fileOutputStream);
        personOutputStream.writePerson(person);
        personOutputStream.close();
        fileOutputStream.close();

        // Read
        FileInputStream fileInputStream = new FileInputStream(file);
        PersonInputStream personInputStream = new PersonInputStream(fileInputStream);
        Person readPerson = personInputStream.readPerson();
        personInputStream.close();
        fileInputStream.close();

        System.out.println(readPerson);
    }
}
