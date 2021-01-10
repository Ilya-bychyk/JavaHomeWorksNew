package homeWork4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer[] arr = new Integer[0];
        DataContainer<Integer> container = new DataContainer<>(arr);

        System.out.println(container.add(777));
        System.out.println(container.add(1));
        System.out.println(container.add(null));
        System.out.println(container.get(4));
        System.out.println(container.get(8));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(0));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(null));
        System.out.println(Arrays.toString(container.getItems()));

    }
}