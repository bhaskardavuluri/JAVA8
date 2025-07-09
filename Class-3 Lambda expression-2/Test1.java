import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface  predicate_one {
  public abstract boolean test(List numbers);
    
}
public class Test1{
    public static void main(String[] args) {
        List <Integer> numbers=Arrays.asList(18,31,286,71,9);
        predicate_one p1=numbers1->numbers1.isEmpty();
        System.out.println(p1.test(numbers));
        Predicate <List> p2=numbers2->numbers2.isEmpty();
        System.out.println(p2.test(numbers));
        
    }
}