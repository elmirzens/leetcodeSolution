package findTheDifference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.findTheDifference( "abcd", "abcde" ) );

    }
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> lis = new ArrayList<>();
        for (char ch:chars) {list.add( String.valueOf( ch ) );}
        for (char ch:chars1) {list1.add( String.valueOf( ch ) );}
        Collections.sort( list );
        Collections.sort( list1 );
        for (int i = 0; i < t.length(); i++) {
            if(list.get( i ).equals( list1.get( i ) )){

            }else {
                lis.add( list1.get( i ) );
            }
        }
        char[] f = lis.get( 0 ).toCharArray();
        return f[0];
    }
}
