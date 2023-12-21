package Task1notDone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        QuizElement q1 = new QuizElement("What is a square?","A square with 4 equal sides", Arrays.asList("A rectangle with 2 short and 2 long sides", "A rectangle with two sides slanting"));
        QuizElement q2 = new QuizElement("What color is the light at the bottom of a traffic light","Green",Arrays.asList("Red","Yellow","White"));
        QuizElement q3 = new QuizElement("What is the capital of France?", "Paris", Arrays.asList("Berlin", "London", "Rome"));
        QuizElement q4 = new QuizElement("How many continents are there on Earth?", "7", Arrays.asList("5", "6", "8"));
        QuizElement q5 = new QuizElement("Which planet is known as the Red Planet?", "Mars", Arrays.asList("Venus", "Jupiter", "Saturn"));
        QuizElement q6 = new QuizElement("Who wrote 'Romeo and Juliet'?", "William Shakespeare", Arrays.asList("Jane Austen", "Charles Dickens", "Mark Twain"));
        QuizElement q7 = new QuizElement("What is the largest mammal on Earth?", "Blue Whale", Arrays.asList("Elephant", "Giraffe", "Dolphin"));
        QuizElement q8 = new QuizElement("What is the main ingredient in guacamole?", "Avocado", Arrays.asList("Tomato", "Onion", "Lime"));
        QuizElement q9 = new QuizElement("Which country is known as the Land of the Rising Sun?", "Japan", Arrays.asList("China", "South Korea", "Thailand"));
        QuizElement q10 = new QuizElement("Who painted the Mona Lisa?", "Leonardo da Vinci", Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Claude Monet"));


        quiz.addQuizElements(q1);
        quiz.addQuizElements(q2);
        quiz.addQuizElements(q3);
        quiz.addQuizElements(q4);
        quiz.addQuizElements(q5);
        quiz.addQuizElements(q6);
        quiz.addQuizElements(q7);
        quiz.addQuizElements(q8);
        quiz.addQuizElements(q9);
        quiz.addQuizElements(q10);


        quiz.playGame();
    }
}