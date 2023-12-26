package Task7doMore;

public class StringHandler {

    public String replaceText(String txt, String[] names){
        for (String s : names) {
            if (txt.contains(s)) {
                txt = txt.replace(s, "Den studerende");
            }
        }
        return txt;
    }

    public String replaceGender(String txt, String[]genderWords){
        if (txt.contains("Han") || txt.contains("Hun")){

        }
        return txt;
    }
}
