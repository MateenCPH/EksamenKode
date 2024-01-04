package Task5doMore;

import java.util.Random;

public class Main {
    private static int high = 101;
    private static int low = 1;
    public static void main(String[] args) {
        TextUI ui = new TextUI();
        Random random = new Random();
        int rndmNumber = random.nextInt(low,high);
        HumanPlayer h = new HumanPlayer();
        ComputerPlayer c = new ComputerPlayer();
        int hGuess = h.makeAGuess(high-1);
        int cGuess = c.makeAGuess(high);

        if (hGuess < rndmNumber){
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Human guess " + hGuess + " was too low");
        } else if (hGuess > rndmNumber) {
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Human guess " + hGuess + " was too high");
        } else if (hGuess == rndmNumber) {
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Human guess " + hGuess + " was on point!");
        }

        if (cGuess < rndmNumber){
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Computer guess " + cGuess + " was too low");
        } else if (cGuess > rndmNumber) {
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Computer guess " + cGuess + " was too high");
        } else if (cGuess == rndmNumber) {
            ui.displayMsg("The number was " + rndmNumber);
            ui.displayMsg("Computer guess " + cGuess + " was on point!");
        }
    }
}
