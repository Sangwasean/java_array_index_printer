import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            try {
                numbers[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                i--;
            }
        }

        System.out.print("Enter an index to retrieve a value: ");
        int index = scanner.nextInt();

        try {
            if (index >= 0 && index <= 4) {
                int value = numbers[index];
                System.out.println("Value at index " + index + ": " + value);
            } else {
                System.out.println("He goes beyond the expected indices. The index must be between 0 and 4.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input for index. Please enter a valid index between 0 and 4.");
        }

        scanner.close();
    }
}
