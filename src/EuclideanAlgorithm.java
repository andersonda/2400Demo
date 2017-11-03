/**
 * Created by danderson on 11/3/17.
 */
public class EuclideanAlgorithm {
    /**
     * returns the gcd of ints a and b using the Euclidean Algorithm
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b){
        int x = a;
        int y = b;

        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
