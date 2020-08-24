import java.util.Scanner;

public class AddToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        // add
        int addition = firstNumber + secondNumber;
        // ouput
        // System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, addition);
        
    }
}