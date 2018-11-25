package armen.sorting;

import java.util.Arrays;

public class SortingTest {

    public static void main(String[] args) {
        int [] array = {5,8,9,13,95,0,-9,55};
        SortingUtil.mergeSort(array);
        System.out.println(Arrays.toString(array));

    }
}
