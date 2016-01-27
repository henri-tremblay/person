package pro.tremblay.person;

/**
 * The task is to write appropriate hashCode() and equals() methods for both classes.
 * Nothing from the above source should be modified but additional fields and methods can be added.
 * Instances of Person and Employee should never be equal to one another. An Employee is equal to another
 * Employee if the role, age, and name are all equal between instances. A Person is equal to another Person
 * instance if the age and name are both equal between instances.
 *
 * @author Henri Tremblay
 */
public class Person {
    private final int age;
    private final String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
            name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " has " + age + " years old";
    }
}
