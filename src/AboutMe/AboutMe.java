package AboutMe;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your surname?");
        String surname = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your height?");
        double height = scanner.nextDouble();

        // Print all the data
        System.out.println("Your name is " + name + " " + surname + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("You are " + height + " meters tall.");
    }
}
