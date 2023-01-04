package moveZeroes;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12,};
        App app = new App();
        app.moveZeroes( array );


    }
    public void moveZeroes(int[] nums) {
        List<Integer> memoryOfPositiveNumber = new ArrayList<>();
        int countOfZeroesNumber = 0;
        for (int num : nums) {
            if(num != 0) {
                memoryOfPositiveNumber.add( num );
            }else {
                countOfZeroesNumber++;
            }
        }
        System.out.println(memoryOfPositiveNumber);
        System.out.println(countOfZeroesNumber);

    }
}
