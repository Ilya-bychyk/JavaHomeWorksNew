package homeWork2.arrays;

import static homeWork2.arrays.HomeWork_2_1.arrayFromConsole;

public class HomeWork_2_2_1 {
    public static void main(String[] args) {
            int[] container1 = arrayFromConsole();
            System.out.print("Содержимое массива:");
            for (int i = 0; i < container1.length; i++) {
                System.out.print(" " + container1[i]);
            }

        }
    }

