package rocks.zipcodewilmington.week3.p06262018Tuesday;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 6/26/18.
 */
public class PeopleTest {
    @Test
    public void addTest() {
        // Given
        int expectedId = 109;
        FunnyPerson expected = new FunnyPerson(expectedId);
        People people = new People();

        // When
        people.add(expected);
        FunnyPerson actual = people.getPersonById(expectedId);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
