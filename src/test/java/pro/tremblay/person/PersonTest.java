package pro.tremblay.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Henri Tremblay
 */
public class PersonTest {

    Person p1 = new Person("Henri", 37);

    @Test
    public void samePersonsHaveTheSameHashcode() {
        Person p2 = new Person("Henri", 37);
        assertThat(p1.hashCode()).isEqualTo(p2.hashCode());
    }

    @Test
    public void twoDifferentPersonsHaveDifferentHashcodes() {
        Person p2 = new Person("Robert", 37);
        assertThat(p1.hashCode()).isNotEqualTo(p2.hashCode());
    }

    @Test
    public void theAgeIsNotRelevantInTheHashCodeCalculation() {
        Person p2 = new Person("Henri", 38);
        assertThat(p1.hashCode()).isEqualTo(p2.hashCode());
    }

    @Test
    public void equalsNullIsFalse() {
        assertThat(p1).isNotEqualTo(null);
    }

    @Test
    public void equalsWithItself() {
        assertThat(p1).isEqualTo(p1);
    }

    @Test
    public void equalsShouldOnlyBeOnSameClass() {
        Person p2 = new Person("Henri", 37) {};
        assertThat(p1).isNotEqualTo(p2);
    }

    @Test
    public void twoPersonsHavingTheSameNameAndAgeAreEquals() {
        Person p2 = new Person("Henri", 37);
        assertThat(p1).isEqualTo(p2);
    }

    @Test
    public void twoPersonsHavingADifferentNamesAreNotEquals() {
        Person p2 = new Person("Robert", 37);
        assertThat(p1).isNotEqualTo(p2);
    }

    @Test
    public void twoPersonsHavingADifferentAgesAreNotEquals() {
        Person p2 = new Person("Henri", 38);
        assertThat(p1).isNotEqualTo(p2);
    }

    @Test
    public void twoPersonsHavingADifferentNamesAndAgesAreNotEquals() {
        Person p2 = new Person("Robert", 38);
        assertThat(p1).isNotEqualTo(p2);
    }

    @Test
    public void toStringReturnExpected() {
        assertThat(p1.toString()).isEqualTo("Person Henri has 37 years old");
    }
}
