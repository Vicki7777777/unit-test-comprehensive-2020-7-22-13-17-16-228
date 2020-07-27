package GuessNumberGame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.String.valueOf;

public class GuessNumberGame{
    private String[] answer = new String[4];
    public GuessNumberGame(AnswerSolution answerSolution){
        for (int i = 0; i < answerSolution.getAnswer().length; i++) {
            this.answer[i]=answerSolution.getAnswer()[i];
        }
    }
    public String guessResult(String guestNumber) {
        String[] guestNumberArray;
        if(guestNumber != null) {
            guestNumberArray = guestNumber.split(" ");
        }
        else {
            return "Wrong Input，Input again";
        }
        int sameElement = 0;
        int sameLocation = 0;

        for(int i = 0; i<guestNumberArray.length; i++){
            for(int j = 0;j<answer.length;j++) {
                if (guestNumberArray[i].equals(answer[j])) {
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
