package exceltodb;

public class common {
    
    public static int randomIntBetween(int a, int b) {
        return (int)Math.floor(Math.random() * ( b-a+1 )+ a);
    }
    
    public static double randomDoubleBetween(double a, double b) {
        return (double) Math.floor(Math.random() * (b-a+1) + a);
    }
    
}
