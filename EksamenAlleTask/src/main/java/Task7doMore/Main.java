package Task7doMore;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Mateen","Rodney","Rebecca","Marcus"};
        String mateenKarakter = "Mateen trak sit spørgsmål kl. 10. Mateen fik karakteren 7. \nRodney trak sit spørgsmål kl. 11. Rodney fik karakteren 4";

        StringHandler s = new StringHandler();
        System.out.println(s.replaceText(mateenKarakter, names));
    }
}
