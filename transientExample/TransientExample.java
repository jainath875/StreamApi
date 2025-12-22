package transientExample;

import java.io.*;

public class TransientExample {
    public static void main(String[] args) {
        UserProfile originalUserProfile = new UserProfile("admin", "secret123", 25);
        System.out.println("Original: " + originalUserProfile);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profile.ser"))) {
            oos.writeObject(originalUserProfile);
            System.out.println("\nSerialization complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("profile.ser"))) {
            UserProfile deserializationProfile = (UserProfile) ois.readObject();
            System.out.println("Deserialized: " + deserializationProfile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
