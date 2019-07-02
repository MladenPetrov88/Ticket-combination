import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int price = 0;
        for (char upperLetter = 'B'; upperLetter <= 'L'; upperLetter++) {
            for (char lowerLetter = 'f'; lowerLetter >= 'a'; lowerLetter--) {
                for (char secondUpperLetter = 'A'; secondUpperLetter <= 'C'; secondUpperLetter++) {
                    for (int firstNum = 1; firstNum <= 10; firstNum++) {
                        for (int secondNum = 10; secondNum >= 1; secondNum--) {
                            price = upperLetter + lowerLetter + secondUpperLetter + firstNum + secondNum;
                            if (upperLetter % 2 == 0) {
                                count++;
                            }
                            if (count == number) {
                                    System.out.printf("Ticket combination: %c%c%c%d%d%n", upperLetter, lowerLetter, secondUpperLetter, firstNum, secondNum);
                                    System.out.printf("Prize: %d lv.", price);
                            }
                        }
                    }
                }
            }
        }
    }
}