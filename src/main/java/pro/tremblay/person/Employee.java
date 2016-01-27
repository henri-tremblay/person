package pro.tremblay.person;

/**
 * @author Henri Tremblay
 */
public class Employee extends Person {
    private final String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && role.equals(((Employee) o).role);
    }

    @Override
    public String toString() {
        return super.toString() + " and is " + role;
    }
}
