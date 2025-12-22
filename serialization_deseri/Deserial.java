package serialization_deseri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ob.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student)ois.readObject();
            student.displayName();
            System.out.println(student.getAge());
            System.out.println(student.getEmail());
        } catch(IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
