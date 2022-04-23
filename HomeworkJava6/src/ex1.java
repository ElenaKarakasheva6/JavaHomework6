/*
Напишете програма, която чете 1 число от конзолата, изчислява му
корен квадратен и отпечатва резултата на екрана, с точност до 5-тия
знак след запетаята.
**/
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner myObj = new Scanner(System.in);
        Integer number = myObj.nextInt();
        double newNumber = Math.sqrt(number);
        System.out.printf("%.5f", newNumber);
    }
}
