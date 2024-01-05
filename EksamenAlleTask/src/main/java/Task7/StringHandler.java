package Task7;

public class StringHandler {

    public String replaceText(String txt, String[] names) {
        for (String s : names) {
            if (txt.contains(s)) {
                txt = txt.replace(s, "Den studerende");
            }
        }
        return txt;
    }

    public String replaceGender(String txt, String[] genderWords) {
        for (String g : genderWords) {
            if (txt.contains("Hun") || txt.contains("Han")) {
                txt = txt.replace(g, "Vedkommende");
            }
            if (txt.contains("Han".toLowerCase()) || txt.contains("Hun".toLowerCase())) {
                txt = txt.replace(g, "vedkommende");
            }
            if (txt.contains("Hendes") || txt.contains("Hans")) {
                txt = txt.replace(g, "Vedkommendes");
            }
            if (txt.contains("Hendes".toLowerCase()) || txt.contains("Hans".toLowerCase())) {
                txt = txt.replace(g, "vedkommendes");
            }
        }
        return txt;
    }
}
