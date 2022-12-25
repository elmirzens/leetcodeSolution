package PerfectNumber;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app .checkPerfectNumber( 7 ));
    }
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        if(num==6) return true;
        return ((Math.sqrt(1+8.0*num)-1)/2)%1==0&&(num%10==6||num%10==8)&&(num%3==1||num%9==1);

    }
}
