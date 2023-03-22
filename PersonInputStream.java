import java.io.*;

public class PersonInputStream extends ObjectInputStream {

    public PersonInputStream(InputStream in) throws IOException {
        super(in);
    }

    public Person readPerson() throws IOException, ClassNotFoundException {
        Object object = readObject();
        if (object instanceof Person) {
            return (Person) object;
        }
        throw new IOException("Object is not a Person");
    }
}
