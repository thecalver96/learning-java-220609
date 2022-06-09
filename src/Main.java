import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Who tall is Stephen Curry?";
        String choiceOne = "179cm";
        String choiceTwo = "1.95m";
        String choiceThree = "6foot3inch";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        System.out.println(question);
        System.out.println("Option 1: " + choiceOne);
        System.out.println("Option 2: " + choiceTwo);
        System.out.println("Option 3: " + choiceThree);
        
        System.out.println("Please enter the your answer:");

        Scanner input = new Scanner(System.in);

        String choice = input.next();

        if(choice.equals(correctAnswer) )
            System.out.println("Correct!");
        else    
            System.out.println("Sorry, the answer is incorrect");


        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
