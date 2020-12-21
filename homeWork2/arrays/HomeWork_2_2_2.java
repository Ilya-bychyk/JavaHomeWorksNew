package homeWork2.arrays;

import static homeWork2.arrays.HomeWork_2_1.arrayFromConsole;

public class HomeWork_2_2_2 {
    public static void main(String[] args) {
            int[] container2 = arrayFromConsole();
            System.out.print("Каждый второй элемент массива:");
            for (int i = 1; i < container2.length; i = i + 2) {
                System.out.print(" " + container2[i]);
            }

        }
    }

