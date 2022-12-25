package checkIfTwoStringArraysAreEquivalent;

import java.util.Objects;

public class App {

    public static void main(String[] args) {
        App app = new App();
        String[] ar = {"abc", "d", "defg"};
        String[] ar1 = {"abcddefg"};
        System.out.println( app.arrayStringsAreEqual( ar, ar1 ) );

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder sts = new StringBuilder();
        for (String word : word1) {
            str.append( word );
        }
        for (String word : word2) {
            sts.append( word );
        }
        String s1 = String.valueOf( str );
        String s2 = String.valueOf( sts );
        return Objects.equals( s1,s2 );
    }
}
