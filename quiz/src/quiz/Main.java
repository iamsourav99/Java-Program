package quiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctAnswerIndex;

    public QuizQuestion(String question, List<String> options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}

class Quiz {
    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private int score;
    private Timer timer;

    public Quiz(List<QuizQuestion> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
        this.timer = new Timer();
    }

    public void start() {
        if (currentQuestionIndex < questions.size()) {
            QuizQuestion currentQuestion = questions.get(currentQuestionIndex);
            System.out.println("Question: " + currentQuestion.getQuestion());
            List<String> options = currentQuestion.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            // Set a timer for 30 seconds to answer the question
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nTime's up!");
                    nextQuestion();
                }
            }, 30000);

            // Get user input for the answer
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your answer (1-" + options.size() + "): ");
            int userAnswerIndex = scanner.nextInt() - 1;

            if (userAnswerIndex >= 0 && userAnswerIndex < options.size()) {
                if (currentQuestion.isCorrect(userAnswerIndex)) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect.\n");
                }
            } else {
                System.out.println("Invalid choice.\n");
            }

            // Cancel the timer
            timer.cancel();

            // Move to the next question
            nextQuestion();
        } else {
            endQuiz();
        }
    }

    private void nextQuestion() {
        currentQuestionIndex++;
        start();
    }

    private void endQuiz() {
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}

public class Main {
    public static void main(String[] args) {
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        // Add your quiz questions with options and correct answer indices here
        quizQuestions.add(new QuizQuestion("What is the capital of France?",
                List.of("London", "Madrid", "Paris", "Berlin"), 2));

        quizQuestions.add(new QuizQuestion("Which planet is known as the Red Planet?",
                List.of("Mars", "Venus", "Jupiter", "Saturn"), 0));

        // Create the quiz and start it
        Quiz quiz = new Quiz(quizQuestions);
        quiz.start();
    }
}
