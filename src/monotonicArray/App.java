package monotonicArray;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.isMonotonic( new int[]{1,3,2} ) );
    }

    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2){
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;
        for (int i=1; i<nums.length; i++){
            if (nums[i-1] > nums[i]){
                increasing = false;
            } else if(nums[i-1] < nums[i]){
                decreasing = false;
            }
            if (!increasing && !decreasing){
                return false;
            }
        }
        return true;
    }
}
