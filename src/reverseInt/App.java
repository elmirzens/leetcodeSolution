package reverseInt;

public class App {

    public static void main(String[] args) {

    }
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder finish = new StringBuilder();
        char[] chars = String.valueOf( x ).toCharArray();
        for (char aChar : chars) {
            if(aChar != '0') {
                stringBuilder.append( aChar );
            }
        }
        int num = Integer.parseInt( String.valueOf( stringBuilder ) );
        char[] chars1 = String.valueOf( num ).toCharArray();
        if(num>=0){
            for (int i = chars1.length - 1; i >= 0; i--) {
                finish.append( chars1[i] );
            }
            return Integer.parseInt(String.valueOf(finish));
        }else {
            for (int i = chars1.length - 1; i >= 0; i--) {
                finish.append( chars1[i] );
            }
            return Integer.parseInt( "-"+finish.subSequence( 0,finish.length()-1 ));
        }
    }
}
