package largestOddNumberInString;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.largestOddNumber( "10133890" ) );
    }

    public String largestOddNumber(String num) {
        if(Integer.parseInt( num ) % 2 != 0) {
            return num;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = num.toCharArray();
        for (char aChar : chars) {
            if(Integer.parseInt( String.valueOf( aChar ) ) % 2 != 0) {
                sb.append( aChar );
            }
        }
        if(String.valueOf(sb).length()==0){
            return "";
        }
        return String.valueOf(sb);
    }
}
