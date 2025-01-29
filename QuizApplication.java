import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "Which programming language is this quiz written in?"
        };

        String[] options = {
            "1. Berlin 2. Madrid 3. Paris 4. Rome",
            "1. 10 2. 12 3. 14 4. 15",
            "1. Python 2. Java 3. C++ 4. JavaScript"
        };

        int[] correctAnswers = {3, 2, 2}; // Correct answer indices for each question
        int score = 0;

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);

            // Get user input
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        // Display final score
        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
