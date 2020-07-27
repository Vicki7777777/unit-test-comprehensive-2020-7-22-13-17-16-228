package GuessNumberGame;

import java.util.Locale;

public class Game {
    private VaildOfInput vaildOfInput = new VaildOfInput();
    private InputGuessNumber inputGuessNumber;
    private AnswerSolution answerSolution;
    private int chance = 6;
    private int times = 0;
    private static final String CONTINUE = "Y";
    private static final String WIN = "4A0B";
    public Game(InputGuessNumber inputGuessNumber, AnswerSolution answerSolution) {
        this.inputGuessNumber = inputGuessNumber;
        this.answerSolution = answerSolution;
        this.times = 0;
    }

    public void startGame(){
        System.out.println("Game start ,you have " + chance + " opportunities:");
        System.out.println("Please input your answer(9 non repeating numbers):");
    }

    private void OverGame(String answer) {
        System.out.println(String.format("Answer should be %s", answer));
        System.out.println("Game over!");
        System.out.println("Do you want to play again?(Y/N)");
    }

    private void beginPlay(GuessNumberGame guessNumberGame) {
        while (this.times < chance) {
            String input = inputGuessNumber.input();
            String[] inputArray = input.split(" ");
            System.out.println(input);
            if (this.vaildOfInput.isValid(inputArray)) {
                String result = guessNumberGame.guessResult(input);
                if (isWin(result)) {
                    System.out.println("You win!");
                    break;
                }
                System.out.println("[result]:" + result);
            } else {
                System.out.println("Wrong Input，Input again!");
            }
            this.times++;
            System.out.println(String.format("[tips]:You still have [%s] time(s).", chance - this.times));
        }
    }

    private boolean wantTORestart() {
        return CONTINUE.equals(inputGuessNumber.command().toUpperCase(Locale.ENGLISH));
    }

    public void start() {
        GuessNumberGame guessNumberGame = new GuessNumberGame(this.answerSolution);
        startGame();
        beginPlay(guessNumberGame);
        OverGame(answerSolution.getAnswer().toString());
        if (wantTORestart()) {
            this.restart();
        }
        inputGuessNumber.close();
    }

    private void restart() {
        this.times = 0;
        this.start();
    }

    private boolean isWin(String answer) {
        return this.times <= chance && WIN.equals(answer);
    }

    public static void main(String[] args) {
        new Game(new InputGuessNumber(), new AnswerSolution()).start();
    }

}
