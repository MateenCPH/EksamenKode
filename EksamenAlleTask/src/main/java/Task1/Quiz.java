package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Quiz {
    private List<QuizElement> quizElements;

    public Quiz() {
        this.quizElements = new ArrayList<>();
    }

    public void addQuizElements(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void askQuestion(QuizElement quizElement) {
        System.out.println(quizElement.getQuestion());
        ArrayList<String> options = quizElement.getAllOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ": " + options.get(i));
        }
    }


    public void playGame() {

        Scanner scanner = new Scanner(System.in);

        for (QuizElement quizElement : quizElements) {
            askQuestion(quizElement);
            System.out.print("Please enter an answer: ");
            String inputAnswer = scanner.nextLine();
            try {
                int chosenIndex = Integer.parseInt(inputAnswer);

                if (chosenIndex == quizElement.getCorrectIndex() -1) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Wrong. The correct answer was: " + quizElement.getCorrectAnswer());
                    userChoice();
                }
            } catch (Exception e) {

                if (quizElement.isCorrect(inputAnswer)/* || inputAnswer.equalsIgnoreCase(String.valueOf(quizElement.getCorrectIndex() + 1))*/) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Wrong. The correct answer was: " + quizElement.getCorrectAnswer());
                    userChoice();
                }
            }
        }
    }


    public void userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to try again? Y/N");
        String inputChoice = scanner.nextLine();
        if (inputChoice.equalsIgnoreCase("Y")) {
            System.out.println("Starting game again...\n");
            playGame();
        } else if (inputChoice.equalsIgnoreCase("N")) {
            System.out.println("Okay goodbye");
            System.exit(1);
        } else {
            System.out.println("Please enter a valid answer!");
            userChoice();
        }
    }


}
