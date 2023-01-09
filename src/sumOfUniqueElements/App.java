package sumOfUniqueElements;


import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.sumOfUnique( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9} ) );
    }
    public int sumOfUnique(int[] nums) {
        int[] array = Arrays.stream( nums ).distinct().toArray();
        return Arrays.stream(array).sum();
    }
}
