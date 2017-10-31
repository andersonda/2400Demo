import java.util.LinkedList;
import java.util.List;

/**
 * Created by danderson on 10/31/17.
 */
public class Eratosthenes {

    // computes primes using the Sieve of Eratosthenes algorithm
    public static List<Integer> computePrimes(int n){
        List<Integer> res = getPositiveIntsLessThanN(n);

        int upper = (int) Math.sqrt((double) n);

        for(int i = 2; i <= upper; i++) {
            removeIntsDivisibleByN(res, i);
        }

        return res;
    }

    // returns positive integers less than or equal to n
    // for example: getPositiveIntsLessThanN(5) returns [2,3,4,5]
    // 1 is not included because it is not prime
    private static List<Integer> getPositiveIntsLessThanN(int n){
        List<Integer> res = new LinkedList<>();

        for(int i = 2; i <= n; i++) {
            res.add(i);
        }

        return res;
    }

    // sets all numbers in integerList that are divisible by n (except n) to -1
    private static void removeIntsDivisibleByN(List<Integer> integerList, int n){
        for(int i = 0; i < integerList.size(); i++){
            int integer = integerList.get(i);

            if(integer != n && integer % n == 0){
                System.out.println("Removing " +  integer + " since it is divisible by " + n);
                integerList.set(i, -1);
            }
        }
    }
}
