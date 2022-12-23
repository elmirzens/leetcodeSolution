package plusone;


public class App {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        StringBuilder l1stringBuilder = new StringBuilder( "" );
        for (int i = 0; i < array.length; i++) {
            l1stringBuilder.append( array[i] );
        }
        int l1Int = Integer.parseInt( String.valueOf( l1stringBuilder ) );
        int result = l1Int+1;
        System.out.println(result);


    }
}
