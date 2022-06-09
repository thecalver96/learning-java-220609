import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'K';
        char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        System.out.println("Current GPA: " + studentGPA);
        System.out.println("What do you want to update gpa to?");
        try (Scanner input = new Scanner(System.in)) {
            studentGPA = input.nextDouble();
        }
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }
}
