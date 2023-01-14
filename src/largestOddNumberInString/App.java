package largestOddNumberInString;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.largestOddNumber( "52" ) );
    }

    public String largestOddNumber(String num) {
        if(Integer.parseInt( num ) % 2 != 0) {
            return num;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            if(Integer.parseInt( String.valueOf( num.charAt( i ) ) ) % 2 == 0) {
                sb.append(num.charAt(i));
            }else {
                return "";
            }
        }
        System.out.println(sb.toString());
        return "";
    }
}
