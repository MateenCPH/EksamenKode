package Task7doMore;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Mateen","Rodney","Rebecca","Marcus"};
        String mateenKarakter = "Mateen trak sit spørgsmål kl. 10. Mateen fik karakteren 7. \nRodney trak sit spørgsmål kl. 11. Rodney fik karakteren 4";

        String[]genderWords = {"Han","Hun","Hans","Hendes","han","hun","hans","hendes"};
        String hendesKarakter = "Hun trak et spørgsmål kl 10. Hun fik karakteren 7.\nHendes forældre var glade og hendes bror var også med. Han var meget glad";

        StringHandler s = new StringHandler();
        System.out.println(s.replaceGender(hendesKarakter, genderWords));
    }
}
