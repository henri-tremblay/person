package pro.tremblay.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Henri Tremblay
 */
public class EmployeeTest {

    Employee e1 = new Employee("Henri", 37, "Architect");

    @Test
    public void sameEmployeesHaveTheSameHashcode() {
        Employee e2 = new Employee("Henri", 37, "Architect");
        assertThat(e1.hashCode()).isEqualTo(e2.hashCode());
    }

    @Test
    public void twoDifferentEmployeesHaveDifferentHashcodes() {
        Employee e2 = new Employee("Robert", 37, "Architect");
        assertThat(e1.hashCode()).isNotEqualTo(e2.hashCode());
    }

    @Test
    public void theAgeIsNotRelevantInTheHashCodeCalculation() {
        Employee e2 = new Employee("Henri", 38, "Architect");
        assertThat(e1.hashCode()).isEqualTo(e2.hashCode());
    }

    @Test
    public void equalsNullIsFalse() {
        assertThat(e1).isNotEqualTo(null);
    }

    @Test
    public void equalsWithItself() {
        assertThat(e1).isEqualTo(e1);
    }

    @Test
    public void equalsShouldOnlyBeOnSameClass() {
        Person p2 = new Person("Henri", 37);
        assertThat(e1).isNotEqualTo(p2);
    }

    @Test
    public void twoEmployeesHavingTheSameNameAndAgeAreEquals() {
        Employee e2 = new Employee("Henri", 37, "Architect");
        assertThat(e1).isEqualTo(e2);
    }

    @Test
    public void twoEmployeesHavingADifferentNamesAreNotEquals() {
        Employee e2 = new Employee("Robert", 37, "Architect");
        assertThat(e1).isNotEqualTo(e2);
    }

    @Test
    public void twoEmployeesHavingADifferentAgesAreNotEquals() {
        Employee e2 = new Employee("Henri", 38, "Architect");
        assertThat(e1).isNotEqualTo(e2);
    }

    @Test
    public void twoEmployeesHavingADifferentRolesAreNotEquals() {
        Employee e2 = new Employee("Henri", 37, "Manager");
        assertThat(e1).isNotEqualTo(e2);
    }

    @Test
    public void twoEmployeesHavingADifferentNamesAgesAndRolesAreNotEquals() {
        Employee e2 = new Employee("Robert", 38, "Manager");
        assertThat(e1).isNotEqualTo(e2);
    }

    @Test
    public void toStringReturnExpected() {
        assertThat(e1.toString()).isEqualTo("Employee Henri has 37 years old and is Architect");
    }
}
