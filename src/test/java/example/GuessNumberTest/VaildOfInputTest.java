package example.GuessNumberTest;

import GuessNumberGame.VaildOfInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VaildOfInputTest {
    @Test
    void should_return_false_when_input_given_repeatInput(){
        //given
        String[] input = {"1","2","1","2"};
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertFalse(flag);
    }
    @Test
    void should_return_true_when_input_given_rightInput(){
        //given
        String[] input = {"1","2","3","4"};
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertTrue(flag);
    }
    @Test
    void should_return_false_when_input_given_nullInput(){
        //given
        String[] input = null;
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertFalse(flag);
    }
    @Test
    void should_return_false_when_input_given_onlyTwoNumber(){
        //given
        String[] input = {"1","2"};
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertFalse(flag);
    }
    @Test
    void should_return_false_when_input_given_fiveNumber(){
        //given
        String[] input = {"1","2","3","4","5"};
        VaildOfInput vaildOfInput = new VaildOfInput();
        //when
        boolean flag = vaildOfInput.isVaild(input);
        //then
        assertFalse(flag);
    }
}
