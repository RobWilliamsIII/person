import java.util.Scanner;

/**
 * Main class to test the Queue and Person classes.
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details of 5 people:");

        // Prompt user to enter details for 5 people
        for (int i = 0; i < 5; i++) {
            System.out.print("\nFirst name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Location: ");
            String location = scanner.nextLine();

            Person person = new Person(firstName, lastName, age, location);
            queue.addPerson(person);
        }

        // Display the queue before sorting
        System.out.println("\nGroup before sorting:");
        for (Person person : queue.getQueue()) {
            System.out.println(person);
        }

        // Sort by last name and display the queue
        queue.quickSortByLastName();
        System.out.println("\nGroup by last name (desc):");
        for (Person person : queue.getQueue()) {
            System.out.println(person.toStringByLastName());
        }

        // Sort by age and display the queue
        queue.quickSortByAge();
        System.out.println("\nGroup by age (desc):");
        for (Person person : queue.getQueue()) {
            System.out.println(person.toStringByAge());
        }

        // Sort by location and display the queue
        queue.quickSortByLocation();
        System.out.println("\nGroup by location (desc):");
        for (Person person : queue.getQueue()) {
            System.out.println(person.toStringByLocation());
        }

        scanner.close();
    }
}
