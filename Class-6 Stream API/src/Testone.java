import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testone {
    public static void main(String[] args) {
        List <Integer> numbers= Arrays.asList(18,31,11,9,8,7);
        List <Integer> even_numbers=numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(even_numbers);
    }

}
