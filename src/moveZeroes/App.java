package moveZeroes;

import java.util.Arrays;


public class App {

    public static void main(String[] args) {


        int[] array = {};











//        int[] array = {0,1,0,3,12};
//        App app = new App();
//        app.moveZeroes( array );


    }
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i];
        while (count < nums.length){
            nums[count++] = 0;
        }
    }
}