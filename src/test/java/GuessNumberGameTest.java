import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberGameTest {

    @Test
    void should_return_4A0B_when_Answer_is_1234_GuessNumber_given_1234() {
        //given
        String guestNumber = "1 2 3 4";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        String actual = guessNumberGame.guessResult(guestNumber);
        //then
        Assertions.assertEquals("4A0B",actual);
    }

}
