package addToArrayFormOfInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
//        System.out.println( app.addToArrayForm( new int[]{1, 2, 0, 0}, 34 ) );
        int a = 11;
        int b = 1;
        System.out.println( Integer.toBinaryString( a+b ) );
    }

    public List<Integer> addToArrayForm(int[] num, int k) {

        int i = num.length-1;
        List<Integer> sol = new ArrayList<>();
        while(i >= 0 || k > 0) {
            if(i >= 0) {
                sol.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                sol.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(sol);
        return sol;
    }
}
