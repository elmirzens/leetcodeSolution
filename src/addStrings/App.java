package addStrings;

public class App {
    public static void main(String[] args) {
        App a = new App();
        System.out.println( a.addStrings( "11", "123" ) );
        System.out.println( a.addStrings( "456", "77" ) );
        System.out.println( a.addStrings( "0", "0" ) );
        System.out.println( a.addStrings( "6913259244", "71103343" ) );
    }
    public String addStrings(String num1, String num2) {
        return String.valueOf( Long.parseLong(num1)+Long.parseLong(num2) );
    }
}
