import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by DY on 14-6-21.
 */
public class GuessTest {

    @Before
    public void setup() {
    }

    /**
     * Unit test
     */
    @Test
    public void mock_both_AnswerGenerator_and_CompareNumber_should_work() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateNoRepeatRandom()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.calculateMatch("1234", "1234")).thenReturn("4A0B");

        Guess guessNumber = new Guess(compareNumber, answerGenerator);

        assertThat(guessNumber.guessNumber("1234")).isEqualTo("4A0B");
    }



}
