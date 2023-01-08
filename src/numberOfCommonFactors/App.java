package numberOfCommonFactors;

public class App {

    public static void main(String[] args) {
        App app = new App();
         System.out.println( app.commonFactors(25,30) );
    }
    public int commonFactors(int a, int b) {
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
}
