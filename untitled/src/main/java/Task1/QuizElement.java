package Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuizElement {
    private String question = "";
    private String correctAnswer = "";
    private final List<String> wrongAnswers;

    public QuizElement(String question, String correctAnswer, List<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String answer) {
        if (answer.equalsIgnoreCase(correctAnswer)) {
            //System.out.println("Correct!");
            return true;
        } else {
            //System.out.println("Wrong!");
            return false;
        }
    }

    public ArrayList<String> getAllOptions() {
        ArrayList<String> allOptions = new ArrayList<>(getWrongAnswers());
        allOptions.add(getCorrectAnswer());
        Collections.shuffle(allOptions);
        return allOptions;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getWrongAnswers() {
        return wrongAnswers;
    }

    public int getCorrectIndex() {
        return getAllOptions().indexOf(getCorrectAnswer());
    }
}


