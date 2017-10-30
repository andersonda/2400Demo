import java.util.LinkedList;
import java.util.List;

/**
 * Created by danderson on 10/29/17.
 */
public class BaseConversion {

    public static List<Integer> convertToBase2(int base10Int){
        int number = base10Int;
        List<Integer> res = new LinkedList<>();

        while(number != 0){
            res.add(number % 2);
            number /= 2;
        }

        return  res;
    }

    public static String convertToBase2String(List<Integer> base2List){
        String res = "";

        for(int i = base2List.size() - 1; i >= 0; i--){
            res += base2List.get(i);
        }

        return res;
    }
}
