package Task5doMore;

public class HumanPlayer implements Player {
    TextUI ui = new TextUI();

    public int makeAGuess(int maxValue) {
        int guess = Integer.parseInt(ui.getInput("Type a number between 1 and " + maxValue));
        if (guess > maxValue){
            System.out.println("Please enter a valid number. Try again");
            makeAGuess(maxValue);
        }
        return guess;
    }
}
