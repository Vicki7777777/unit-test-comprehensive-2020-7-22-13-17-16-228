package GuessNumberGame;

import java.util.HashSet;
import java.util.Set;

public class VaildOfInput {

    public boolean isVaild(String[] input) {
        boolean vaild = true;
        Set<String> vaildSet = new HashSet<String>();
        if(input == null){
            vaild = false;
        }else{
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
