package homeWork2.arrays;

import static homeWork2.arrays.HomeWork_2_1.arrayFromConsole;

public class HomeWork_2_2_3 {
    public static void main(String[] args) {
        int[] container2 = arrayFromConsole();
        System.out.println("Элементы в обратном порядке");
        for (int i = container2.length - 1; i >= 0; i--) {
            System.out.println(container2[i]);
        }
    }
}
