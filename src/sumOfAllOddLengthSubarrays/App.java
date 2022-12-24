package sumOfAllOddLengthSubarrays;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        int[] ar = {1,4,2,5,3};
        System.out.println( app.sumOddLengthSubarrays( ar ) );

    }
    public int sumOddLengthSubarrays(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        for (int j : arr) {
            if(j % 2 != 0) {
                odd.add( j );
            }
        }
        System.out.println(odd);
        return 0;
    }
}

