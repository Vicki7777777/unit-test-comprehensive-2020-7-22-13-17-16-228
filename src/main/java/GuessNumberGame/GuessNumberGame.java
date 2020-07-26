package GuessNumberGame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.String.valueOf;

public class GuessNumberGame implements Answer {

    public String[] Answer(){
        Set<String> randomSet = new HashSet<String>();
        String[] randomNumber = new String[4];
        while (randomSet.size() < 4) {
            randomSet.add(valueOf((int) (Math.random() * 8) + 1));
        }
        Iterator<String> randomSetIterator = randomSet.iterator();
        for(int i=0;i<randomSet.size();i++){
            randomNumber[i] = valueOf(randomSetIterator.next());
        }


        return randomNumber;
    }


    public String guessResult(String guestNumber) {
        String[] guestNumberArray = null;
        String guessResult = "";
        String wrongResult = "Wrong Input，Input again";
        if(guestNumber != null) {
            guestNumberArray = guestNumber.split(" ");
        }
        else {
            guessResult = wrongResult;
        }

        String[] answerNumberArray = Answer();

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
