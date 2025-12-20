package method_chaining;

public class Main {
    public static void main(String[] args) {
        
        Student student = Student.of()
            .setName("Alice")
            .setAge(20)
            .setCity("New York");

        System.out.println(student);
    }
}
