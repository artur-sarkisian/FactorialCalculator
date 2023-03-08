import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter>:");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;

        for (int i = 2; i <= value; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа равен: " + factorial);
    }
}
