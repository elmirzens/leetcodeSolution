package squresOfASortedArray;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( Arrays.toString( app.sortedSquares( new int[]{-4, -1, 0, 3, 10} ) ) );
    }

    public int[] sortedSquares(int[] nums) {
        return Arrays.stream( nums ).map( i -> i * i ).sorted().toArray();
    }
}