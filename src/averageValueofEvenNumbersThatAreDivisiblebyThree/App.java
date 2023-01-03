package averageValueofEvenNumbersThatAreDivisiblebyThree;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        App app = new App();
        System.out.println( app.averageValue( new int[]{1,2,4,7,10} ) );

    }
    public int averageValue(int[] nums) {
        List<Integer> even = new ArrayList<>();

        for (int num : nums) {
            if(num % 2 == 0) {
                even.add( num );
            }
        }
        if(even.size() == 1){
            return 0;
        }
        int sum = even.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum/even.size();
    }
}
