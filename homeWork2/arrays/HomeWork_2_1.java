package homeWork2.arrays;

import java.util.Scanner;

public class HomeWork_2_1 {
    public static void main(String[] args) {
        arrayFromConsole();
    }

    public static int[] arrayFromConsole() {
        System.out.println("Укажите размер массива");
        Scanner a = new Scanner(System.in);
        int lenghtArr = a.nextInt();
        int container[] = new int[lenghtArr];
        System.out.println("Укажите элементы массива");
        for (int i = 0; i < lenghtArr; i++) {
            container[i] = a.nextInt();
        }

         return container;
    }
}
