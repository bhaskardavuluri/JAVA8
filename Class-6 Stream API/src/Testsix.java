import java.util.Arrays;
import java.util.List;

public class Testsix{
    //Print the sum of all the even numbers with using Streams..
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(18,31,8,11,7,41);
        int  even_number=numbers.stream()
                .filter(num->num%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(even_number);

    }

}