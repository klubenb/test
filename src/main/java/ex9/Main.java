package ex9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        System.out.println(Arrays.deepToString(arr));
    }
}
