import java.util.ArrayList;
import java.util.List;

public class ImmutablePersonDemo {
    public static void main(String[] args) {
        // Create a list of hobbies
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Gaming");
        hobbies.add("Coding");
        
        // Create an ImmutablePerson object
        ImmutablePerson person = new ImmutablePerson("John Doe", 25, hobbies);
        
        // Get and display details
        System.out.println("=== Person Details ===");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Hobbies: " + person.getHobbies());
        System.out.println();
        
        // Print using toString()
        System.out.println("Full Details: " + person);
        System.out.println();
        
        // Demonstrate immutability - modifying original list doesn't affect object
        System.out.println("=== Testing Immutability ===");
        System.out.println("Original hobbies list before modification: " + hobbies);
        hobbies.add("Swimming");  // Modify original list
        System.out.println("Original hobbies list after modification: " + hobbies);
        System.out.println("Person's hobbies (unchanged): " + person.getHobbies());
        System.out.println();
        
        // Try to modify the returned hobbies (doesn't affect the original object)
        List<String> personHobbies = person.getHobbies();
        personHobbies.add("Drawing");
        System.out.println("Modified returned list: " + personHobbies);
        System.out.println("Person's hobbies (still unchanged): " + person.getHobbies());
    }
}
