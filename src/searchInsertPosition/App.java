package searchInsertPosition;

public class App {

    public static void main(String[] args) {
        int[] array  = {1,3,5,6};
        System.out.println( searchInsert( array, 2 ) );
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
