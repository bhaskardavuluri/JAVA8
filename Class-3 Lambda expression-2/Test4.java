import java.util.Arrays;
import java.util.List;

interface Function_one{
    public abstract boolean test(List numbers);
}
public class Test4 {
    public static void main(String[] args) {
        List <Integer> numbers=Arrays.asList(10,202,300,500,800);
        Function_one f=nums->nums.isEmpty();
        System.out.println(f.test(numbers));
    }
    
}
