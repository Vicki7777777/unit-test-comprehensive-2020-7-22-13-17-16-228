import static java.lang.String.valueOf;

public class GuessNumberGame implements Answer {

    public int Answer() {
        return 1234;
    }

    public String guessResult(String guestNumber) {
        String[] guestNumberArray = guestNumber.split(" ");


        String answerNumber = valueOf(Answer());
        String[] answerNumberArray = answerNumber.split("");

        int sameElement = 0;
        int sameLocation = 0;

        for(int i = 0; i<guestNumberArray.length; i++){
            for(int j = 0;j<answerNumberArray.length;j++) {
                if (guestNumberArray[i].equals(answerNumberArray[j])) {
                    if(i == j) {
                        sameLocation += 1;
                    } else{
                        sameElement += 1;
                    }
                }

            }
        }

        return sameLocation+"A"+sameElement+"B";
    }
}
