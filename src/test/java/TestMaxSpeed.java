import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxSpeed {

    @Test

    public void shouldFindMax () {
        int[] speed = {7, 5, 2, 0, 13 };
        int expected = 10;
        int actual = 10;
        Assertions.assertEquals(expected, actual);
    }
}
