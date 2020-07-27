package GuessNumberGame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.String.valueOf;

public class AnswerSolution implements Answer {
    public String[] getAnswer(){
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
}
