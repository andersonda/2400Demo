import java.util.LinkedList;
import java.util.List;

/**
 * Created by danderson on 10/29/17.
 */
public class BinaryArithmetic {
    public static List<Integer> binarySum(List<Integer> lhs, List<Integer> rhs){
        addLeadingZerosForAddition(lhs, rhs);
        List<Integer> res = new LinkedList<>();

        int c = 0;
        for(int i = 0; i < lhs.size(); i++){
            int d = (lhs.get(i) + rhs.get(i) + c) / 2;
            res.add(lhs.get(i) + rhs.get(i) + c - 2 * d);
            c = d;
        }

        return normalize(res);
    }

    public static List<Integer> binaryProduct(List<Integer> lhs, List<Integer> rhs){
        List<Integer> res = new LinkedList<>();
        res.add(0);

        for(int i = 0; i < rhs.size(); i++){
            List<Integer> partialProduct = new LinkedList<>();

            // if we are multiplying by 0, this partial product is 0
            if(rhs.get(i) == 0){
                partialProduct.add(0);
            }
            else{
                // shift by i units
                for(int j = 0; j < i; j++){
                    partialProduct.add(0);
                }
                // since we are multiplying by 1, we record all bits in lhs
                partialProduct.addAll(lhs);
            }

            res = binarySum(res, partialProduct);
        }

        return normalize(res);
    }

    // compute b^p using binary modular exponentiation
    public static int binaryModularExponentiation(int b, int p) {
        List<Integer> n = BaseConversion.convertToBase2(p);
        int x = 1;
        int power = b;

        for (Integer aN : n) {
            if (aN == 1) {
                x = x * power;
            }
            power = power * power;
        }

        return x;
    }

    private static void addLeadingZerosForAddition(List<Integer> lhs, List<Integer> rhs){
        if(lhs.size() < rhs.size()){
            for(int i = lhs.size(); i < rhs.size(); i++){
                lhs.add(0);
            }
        }

        if(rhs.size() < lhs.size()){
            for(int i = rhs.size(); i < lhs.size(); i++){
                rhs.add(0);
            }
        }

        // add one more leading zero in case of carry
        lhs.add(0);
        rhs.add(0);
    }

    // remove leading zeros from a binary number
    private static List<Integer> normalize(List<Integer> binaryNum) {
        for (int i = binaryNum.size() - 1; i >= 0; i--) {
            if (binaryNum.get(i) == 0) {
                binaryNum.remove(i);
            } else {
                break;
            }
        }
        return binaryNum;
    }
}
