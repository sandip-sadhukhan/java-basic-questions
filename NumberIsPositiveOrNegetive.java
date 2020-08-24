import java.util.Scanner;
public class NumberIsPositiveOrNegetive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        if (number>0){
            System.out.println(number + " is positive");
        }else if(number == 0){
            System.out.println(number + " is neither positive or negetive");
        }else{
            System.out.println(number + " is negetive");
        }
    }
}