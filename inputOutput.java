import java.util.Scanner;

public class inputOutput {

    // functional method now reuses the same Scanner
    static int functionnalCallinng(Scanner scanner) {
        System.out.println("Functional Calling in inputOutput class");
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // single Scanner

        System.out.println("Enter some input:");

        int y = 0;
        try {
            y = functionnalCallinng(scanner);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(y);

        scanner.nextLine(); // consume leftover newline after nextInt()
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered String: " + userInput);
        System.out.println("Input and Output Operations");

        scanner.close(); // close only once, at the end
    }
}
