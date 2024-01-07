package Task1;

import java.util.List;

public class QuizElement {
    private String question;
    private String correctAnswer;
    private final List<String> wrongAnswers;

    public QuizElement(String question, String correctAnswer, List<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String answer) {
        if (answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            return false;
        }
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
}


