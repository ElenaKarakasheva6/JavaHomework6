/*
Напишете програма, която прочита число от конзолата и отпечатва
дали то е четно или нечетно. (Подсказка: използвайте оператора ?:)
**/
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String oddOrEven = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + oddOrEven);
    }
}
