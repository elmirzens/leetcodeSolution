package averageValueofEvenNumbersThatAreDivisiblebyThree;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        App app = new App();
        System.out.println( app.averageValue( new int[]{1,2,4,7,10} ) );

    }
    public int averageValue(int[] nums) {
        int count = 0;
        int sum =0;

        for (int num : nums) {
            if (num%6==0){
                count++;
                sum+=num;
            }
        }
        return count == 0?0:sum/count;
    }
}
