package homeWork2.loops;
import java.util.Scanner;

class HomeWork_2_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String number1 = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число:");
        String number2 = scanner2.nextLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int x = 1;
            for(int i = 1; i <= b; i++) {
            x *= a;
            }
        System.out.println(number1 + " в степени " + number2 + " = " + x);
    }
}

