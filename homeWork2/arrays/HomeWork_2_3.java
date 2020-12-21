package homeWork2.arrays;


import java.util.Random;
public class HomeWork_2_3 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5,50);
        }
        public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random random = new Random();
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = random.nextInt(maxValueExclusion);
            System.out.println(resultArray[i]);
             }
        return resultArray;
    }
}
