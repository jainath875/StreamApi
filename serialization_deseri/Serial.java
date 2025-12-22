package serialization_deseri;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {
        Student student = new Student("jainath", "jai@gmail.com", 26, "bokaro");

        //write data to file
            FileOutputStream fos = new FileOutputStream("ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);

            oos.close();
            fos.close();

            System.out.println("Object state is transfer to file ob !!");
        

        
    }
}
