import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by DY on 14-6-21.
 */
public class AnswerGeneratorTest {

    private AnswerGenerator answerGenerator;

    @Before
    public void setup() {
        answerGenerator = new AnswerGenerator(new Random());
    }


    @Test
    public void number_should_contains_only_number() {
        String num = answerGenerator.generateNoRepeatRandom();
        for (int i = 0; i < num.length(); i++) {
            assertThat(num.charAt(i)).isGreaterThanOrEqualTo('0').isLessThanOrEqualTo('9');
        }
    }

    @Test
    public void number_should_has_exact_length() {
        String num = answerGenerator.generateNoRepeatRandom();
        assertThat(num.length()).isEqualTo(4);
    }

    @Test
    public void number_should_have_no_repeat_number() {

        String num = answerGenerator.generateNoRepeatRandom();

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length() && i != j; j++) {
                assertThat(num.charAt(i)).isNotEqualTo(num.charAt(j));
            }
        }
    }

    @Test
    public void numbers_should_not_repeat_within_3_generates() {
        List<String> randomList = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            randomList.add(answerGenerator.generateNoRepeatRandom());
        }
        for (int i = 0; i < randomList.size(); i++) {
            for (int j = 0; j < randomList.size() && i != j; j++) {
                assertThat(randomList.get(i)).isNotEqualTo(randomList.get(j));
            }
        }
    }

}
