import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
   public static void main(String[] args) {
    List <Integer> numbers=Arrays.asList(18,31,11,8,1015,17);
    Function <List,Integer> f=nums->nums.size();
    System.out.println(f.apply(numbers));
    Predicate <List> p=nums->nums.isEmpty();
    System.out.println(p.test(numbers));
    Consumer <List> c=nums->{
        for (Object num : numbers) {
            System.out.println(num);
        }
    };
    c.accept(numbers);
   } 
}
