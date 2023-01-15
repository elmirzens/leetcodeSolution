package findTheDifference;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.findTheDifference( "abcd", "abcde" ) );

    }
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i =0; i<sArray.length-1;i++){
            if(sArray[i]!=tArray[i]){
                return tArray[i];
            }
        }
        return tArray[tArray.length-1];
    }
}
