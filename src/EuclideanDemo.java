import java.util.Scanner;

/**
 * Created by danderson on 11/3/17.
 */
public class EuclideanDemo {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a and b for the calculation gcd(a, b)");
        System.out.print("a: ");
        int a = kbd.nextInt();
        System.out.print("b: ");
        int b = kbd.nextInt();

        System.out.println("The gcd of " + a + " and " + b + " is " + EuclideanAlgorithm.gcd(a, b));

        kbd.close();
    }
}
