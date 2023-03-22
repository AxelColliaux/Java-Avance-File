import java.io.*;

public class PersonOutputStream extends ObjectOutputStream {

    public PersonOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public void writePerson(Person person) throws IOException {
        writeObject(person);
    }
}
