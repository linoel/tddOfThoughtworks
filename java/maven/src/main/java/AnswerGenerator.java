import java.util.Random;

/**
 * Created by DY on 14-6-21.
 */
public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }


    public String generateNoRepeatRandom() {

        StringBuilder sb = new StringBuilder();

        for (int i =0; i < 4; i++) {
            int d = random.nextInt(10);
            while (sb.toString().contains(""+d)) {
                d = random.nextInt(10);
            }

            sb.append(d);
        }

        return sb.toString();
    }

}
