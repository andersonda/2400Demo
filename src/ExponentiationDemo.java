import java.util.Scanner;

/**
 * Created by danderson on 10/30/17.
 */
public class ExponentiationDemo {

    public static void main(String[] args){
        int b, p;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter b, p (for computation b^p): ");
        b = kbd.nextInt();
        p = kbd.nextInt();
        System.out.println(b + "^" + p + " equals: " + BinaryArithmetic.binaryModularExponentiation(b, p));

        kbd.close();
    }
}
