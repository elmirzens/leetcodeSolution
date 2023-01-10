package subtracttheProductandSumofDigitsofanInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
       App app = new App();
        System.out.println( app.subtractProductAndSum( 234 ) );
    }
    public int subtractProductAndSum(int n) {
        List<Integer> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append( n ).reverse();
        int num = Integer.parseInt( String.valueOf( sb ) );
        while (num > 0) {
           l.add(num % 10);
            num = num / 10;
        }
        l.stream().map( x -> x * x ).forEach( System.out::println );
        return num;
    }
}
