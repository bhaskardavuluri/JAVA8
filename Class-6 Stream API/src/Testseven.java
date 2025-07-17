import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Print the sum of all the even numbers without using streams [normal way].
public class Testseven {
    public static void main(String[] args) {
        int total=0;
        List<Integer> numbers = Arrays.asList(18, 31, 8, 11, 7, 41);
        List<Integer> sumofeve = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                total=total+num;
                System.out.println(total);

            }
        }
    }
}

