package binarySearch;

public class App {

    public static void main(String[] args) {

        App app = new App();
        System.out.println( app.search( new int[]{-1, 0, 3, 5, 9, 12}, 3 ) );
    }

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return - 1;
    }
}
