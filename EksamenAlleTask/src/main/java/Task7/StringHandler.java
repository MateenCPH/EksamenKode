package Task7;

import java.util.ArrayList;
import java.util.Arrays;

public class StringHandler {

    public void replaceText(String txt, String[] names){
        if (txt.contains(Arrays.toString(names))){
            String denStuderende = txt.replace(names, "den studerende");
        }
    }
}
