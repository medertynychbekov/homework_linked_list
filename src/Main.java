import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 1, 0, 1, 0};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 0, 1, 0, 1, 0));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 0, 1, 0, 1, 0));

        System.out.println("Collections before sorting:");
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);

        sort(array);
        sort(arrayList);
        sort(linkedList);

        System.out.println("Collections after sorting");
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }
}