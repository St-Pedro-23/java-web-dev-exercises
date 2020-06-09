package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";

        input = new Scanner(System.in);
        System.out.println("Hello, what word would you like to search?");
        String word = input.nextLine();
        input.close();

        String firstLower= first.toLowerCase();
        String wordNext = word.toLowerCase();

        boolean contains = firstLower.contains(wordNext);

        if (contains == true) {
            System.out.println("Congratulations, " + word + " has been found within the text!");
        } else {
            System.out.println("My apologies, " + word + " has not been found within the text.");
        }
    }
}
