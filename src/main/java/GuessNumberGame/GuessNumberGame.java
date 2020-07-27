package GuessNumberGame;

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
        return judgeResult(guestNumberArray);

    }

    public String judgeResult(String[] guestNumberArray){
        int sameElement = 0;
        int sameLocation = 0;

        for(int i = 0; i<guestNumberArray.length; i++){
            for(int j = 0;j<answer.length;j++) {
                if (guestNumberArray[i].equals(answer[j])) {
                    if(i == j) {
                        sameLocation ++;
                    } else{
                        sameElement ++;
                    }
                }

            }
        }

        return sameLocation+"A"+sameElement+"B";
    }


}
