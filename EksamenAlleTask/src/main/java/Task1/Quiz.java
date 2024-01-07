package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<QuizElement> quizElements;
    //private ArrayList<String> options;

    public Quiz() {
        this.quizElements = new ArrayList<>();
    }

    public void addQuizElements(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void askQuestion() {
        Scanner scanner = new Scanner(System.in);
        for (QuizElement s : quizElements) {
            System.out.println(s.getQuestion());
            for (int i = 0; i < s.getWrongAnswers().size(); i++) {
                System.out.println((i + 1) + ". " + s.getWrongAnswers().get(i));
            }

            System.out.println("4. " + s.getCorrectAnswer());

            System.out.println("Please choose an answer");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong. The correct answer was: " + s.getCorrectAnswer());
            }
        }
    }

    public void playGame() {
        for (int i = 0; i < quizElements.size(); i++) {
            askQuestion();
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
