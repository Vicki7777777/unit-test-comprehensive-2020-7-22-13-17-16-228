package GuessNumberGame;

import java.util.Scanner;

public class InputGuessNumber {
    private final Scanner guessNumberScanner;
    public InputGuessNumber(){
        this.guessNumberScanner = new Scanner(System.in);
    }
    public String input() {
        String content = guessNumberScanner.nextLine();
        return content;
    }

    public String command() {
        return this.guessNumberScanner.next();
    }

    public void close() {
        this.guessNumberScanner.close();
    }

}
