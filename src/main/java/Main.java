import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        String input = scanner.nextLine();
        System.out.printf("You Entered: %s%n", input);

        if(StringUtils.isNumeric(input)){
            System.out.printf("%s is a number%n", input);
        }
        else {
            System.out.printf("%s is not a number%n", input);
        }

        System.out.printf("Flipped Case: %s%n", StringUtils.swapCase(input));
        System.out.printf("Reverse: %s%n", StringUtils.reverse(input));

    }

}
