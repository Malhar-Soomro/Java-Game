import java.util.Random;
import java.util.Scanner;

public class Java_Project {
    public static void main(String[] args) {
        Random rn = new Random();
        String str = null;
        String comp = null;
        System.out.println("To play write rock , scissor or paper");

        int x;
        x = rn.nextInt(100);
        if (x <= 33) {
            comp = "rock";
        } else if (x <= 66) {
            comp = "scissor";
        } else if (x <= 99) {
            comp = "paper";
        }
        // System.out.println(comp);
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if (comp.equalsIgnoreCase(str)) {
            System.out.println("Draw");
        } else if (comp.equalsIgnoreCase("rock") && str.equalsIgnoreCase("scissor")) {
            System.out.println("Computer wins!");
        } else if (comp.equalsIgnoreCase("scissor") && str.equalsIgnoreCase("rock")) {
            System.out.println("You win!");
        } else if (comp.equalsIgnoreCase("paper") && str.equalsIgnoreCase("rock")) {
            System.out.println("Computer wins!");
        } else if (comp.equalsIgnoreCase("rock") && str.equalsIgnoreCase("paper")) {
            System.out.println("You win!");
        } else if (comp.equalsIgnoreCase("scissor") && str.equalsIgnoreCase("paper")) {
            System.out.println("Computer wins!");
        } else if (comp.equalsIgnoreCase("paper") && str.equalsIgnoreCase("scissor")) {
            System.out.println("You win!");

        }

        System.out.println("Computer choice was: " + comp);

    }
}
