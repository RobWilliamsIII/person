/**
 *person with a first name, last name, age, and location.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String location;

    /**
     * create a Person object with the given details.

     */
    public Person(String firstName, String lastName, int age, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Returns person with the last name first.
     */

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
    public String toStringByLastName() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    /**
     * Returns person with the age first.
     */
    public String toStringByAge() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    /**
     * Returns person with the location first.
     */
    public String toStringByLocation() {
        return "Person{" +
                "location='" + location + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
