import java.util.Scanner;

public class SkillBuilder1 {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        String userString = scnr.next();

        System.out.print(userInt + " ");
        System.out.print(userDouble + " ");
        System.out.print(userChar + " ");
        System.out.println(userString);

        System.out.print(userString + " ");
        System.out.print(userChar + " ");
        System.out.print(userDouble + " ");
        System.out.println(userInt);

        System.out.print(userDouble + "cast to an integer is" + (int)Math.floor(userDouble) + " ");


        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}