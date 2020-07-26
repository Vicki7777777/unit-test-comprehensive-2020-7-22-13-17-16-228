package example.GuessNumberTest;

import GuessNumberGame.VaildOfInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class VaildOfInputTest {
    @Test
    void should_return_wrongMessage_when_inputWrong_given_repeatInput(){
        //given
        String[] input = {"1","2","1","2"};
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertFalse(flag);
    }
}
