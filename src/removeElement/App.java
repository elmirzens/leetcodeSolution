package removeElement;


public class App {
    public static void main(String[] args) {
        int[] news = {1, 2, 3, 3, 5, 6, 7};
        System.out.println( removeElement( news, 3 ) );
    }

    public static int removeElement(int[] nums, int val) {
        int m = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
