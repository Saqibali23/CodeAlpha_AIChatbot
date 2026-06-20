import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      AI CHATBOT SYSTEM");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print(name + ": ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye " + name + "!");
                break;
            }

            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great. Thanks for asking.");
            }

            else if (input.contains("your name")) {
                System.out.println("Bot: I am an AI Chatbot developed in Java.");
            }

            else if (input.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            }

            else if (input.contains("date")) {
                System.out.println("Bot: Today's date is " + LocalDate.now());
            }

            else if (input.contains("time")) {
                System.out.println("Bot: Current time is " + LocalTime.now().withNano(0));
            }

            else if (input.contains("ai")) {
                System.out.println("Bot: AI stands for Artificial Intelligence.");
            }

            else if (input.contains("university")) {
                System.out.println("Bot: Focus on programming, projects and problem solving.");
            }

            else if (input.contains("internship")) {
                System.out.println("Bot: Internships help you gain practical experience.");
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}