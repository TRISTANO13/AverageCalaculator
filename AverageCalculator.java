import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a list of numbers with spaces in between:");
        String userInput = scanner.nextLine();
        double average = calculateAverage(userInput);
        System.out.println("The average of the numbers is: " + average);
    }

    public static double calculateAverage(String numbers) {
        String[] numberArray = numbers.trim().split(" ");
        ArrayList<Integer> intList = new ArrayList<>();
        for (String num : numberArray) {
            intList.add(Integer.parseInt(num));
        }

        double total = 0;
        for (int num : intList) {
            total += num;
        }

        return total / intList.size();
    }
}
