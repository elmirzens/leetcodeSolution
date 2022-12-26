package plusone;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1,0};
        System.out.println( Arrays.toString( plusOne( array ) ) );
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else {
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] ars = new int[digits.length+1];
            ars[0] = 1;
            return ars;
        }
        return digits;
    }

}