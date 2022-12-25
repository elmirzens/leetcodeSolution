package addDigits;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.addDigits( 38 ) );
    }
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        else if(num % 9 == 0) {
            return 9;
        }
        else {
            return num % 9;
        }
    }
    }
