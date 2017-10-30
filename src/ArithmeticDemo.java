import java.util.List;
import java.util.Scanner;

/**
 * Created by danderson on 10/29/17.
 */
public class ArithmeticDemo {
    public static void main(String[] args){
        int lhs, rhs;
        List<Integer> lhsBinary, rhsBinary, sum, product;
        String sumString, productString;

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the first base 10 integer:");
        lhs = kbd.nextInt();
        lhsBinary = BaseConversion.convertToBase2(lhs);
        System.out.println("Your first number in base 2 is: " + BaseConversion.convertToBase2String(lhsBinary));

        System.out.print("Enter the second base 10 integer:");
        rhs = kbd.nextInt();
        rhsBinary = BaseConversion.convertToBase2(rhs);
        System.out.println("Your second number in base 2 is: " + BaseConversion.convertToBase2String(rhsBinary));

        System.out.println();

        sum = BinaryArithmetic.binarySum(lhsBinary, rhsBinary);
        sumString = BaseConversion.convertToBase2String(sum);
        System.out.println("Ths sum of the two binary numbers is: " + sumString + " (" +
                Integer.parseInt(sumString, 2) + " in base 10)");

        product = BinaryArithmetic.binaryProduct(lhsBinary, rhsBinary);
        productString = BaseConversion.convertToBase2String(product);
        System.out.println("The product of the two binary numbers is: " + productString + " (" +
                Integer.parseInt(productString, 2) + " in base 10)");


        kbd.close();
    }
}
