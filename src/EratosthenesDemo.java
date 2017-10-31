import java.util.List;
import java.util.Scanner;

/**
 * Created by danderson on 10/31/17.
 */
public class EratosthenesDemo {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int n;

        System.out.print("Enter the upper bounds for the Sieve of Eratosthenes: ");
        n = kbd.nextInt();

        kbd.close();

        List<Integer> res = Eratosthenes.computePrimes(n);

        String output = "[";
        for(Integer i : res){
            if(i != -1) {
                output += i + ", ";
            }
        }

        // remove last comma
        output = output.substring(0, output.length() - 2);
        output += "]";

        System.out.println("The prime numbers <= " + n + " are " + output);
    }
}
