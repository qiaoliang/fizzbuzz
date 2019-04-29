import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int count;
    private String expected;
    private FizzBuzz fizzBuzz = new FizzBuzz();

    public FizzBuzzTest(int count, String expected) {
        this.count = count;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Collection prepareData() {
        Object[][] object = {
                {3, FizzBuzz.FIZZ},
                {5, FizzBuzz.BUZZ},
                {13, FizzBuzz.FIZZ},
                {52, FizzBuzz.BUZZ},
                {53, FizzBuzz.FIZZ+FizzBuzz.BUZZ},
                {51, FizzBuzz.FIZZ+FizzBuzz.BUZZ},
                {57, FizzBuzz.FIZZ+FizzBuzz.BUZZ},
                {35, FizzBuzz.FIZZ+FizzBuzz.BUZZ},

        };
        return Arrays.asList(object);
    }

    @Test
    public void
    say() throws Exception {
        assertThat(fizzBuzz.say(this.count), is(this.expected));
    }

}
