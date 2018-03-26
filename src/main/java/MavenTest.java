import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();

        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("There are numbers in this string.");
        } else {
            System.out.println("You entered: " + userInput);
            String flipStr = StringUtils.swapCase(userInput);
            System.out.println(flipStr);

            String reverseStr = StringUtils.reverse(userInput);
            System.out.println(reverseStr);

            MavenTest.output(userInput);
        }
    }

    private static void output(String userInput) {

        boolean vowelCheck = (StringUtils.containsAny("aeiou", userInput));

        if (vowelCheck) {
            System.out.println("Contains vowels");
        } else {
            System.out.println("Does not contain vowels");
        }
    }
}
