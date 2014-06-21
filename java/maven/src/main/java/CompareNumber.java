
public class CompareNumber {

    //返回 所猜数字 中含有 多少 A
    public int countA(String challenge, String guess) {
        int count = 0;
        for (int i = 0; i < challenge.length(); i++) {
            if (challenge.charAt(i) == guess.charAt(i)) {
                count += 1;
            }
        }


        return count;
    }

    /**
     * 判断 guess 中 包含多少个 challenge的数字
     * @param challenge
     * @param guess
     * @return
     */
    public int countBIncludingA(String challenge, String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < challenge.length(); j++) {
                if (guess.charAt(i) == challenge.charAt(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }


    /**
     *
     * @param challenge
     * @param guess
     * @return
     */
    public String calculateMatch(String challenge, String guess) {

        int countA = 0;
        int countB = 0;

        for(int i = 0;i< challenge.length();i++){
            if(challenge.charAt(i) == guess.charAt(i)){
                countA++;
            }else if(challenge.indexOf(guess.charAt(i))>=0){
                countB++;
            }
        }
        return countA + "A" + countB + "B";
    }
}
