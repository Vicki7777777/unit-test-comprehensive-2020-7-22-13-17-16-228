package GuessNumberGame;

import java.util.HashSet;
import java.util.Set;

public class VaildOfInput {

    public boolean isValid(String[] input) {
        boolean vaild = true;
        Set<String> vaildSet = new HashSet<String>();
        if(input == null || (input.length != 4)){
            vaild = false;
        } else{
            for(int i=0;i<input.length;i++){
                vaildSet.add(input[i]);
            }
            int i = vaildSet.size();
            if (vaildSet.size() != input.length){
                vaild = false;
            }
        }

        return vaild;
    }
}
