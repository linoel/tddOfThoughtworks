/**
 * Created by DY on 14-6-21.
 */
public class Guess {

    private CompareNumber compareNumber;
    private String noRepeatNum;

    public Guess(CompareNumber compareNumber, AnswerGenerator answerGenerator) {
        this.compareNumber = compareNumber;
        this.noRepeatNum = answerGenerator.generateNoRepeatRandom();
    }


    public String guessNumber(String guessNumber){

        return compareNumber.calculateMatch(noRepeatNum,guessNumber);
    }

}
