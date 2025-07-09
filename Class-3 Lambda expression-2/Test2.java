//example for converting the lambda expression into normsl java code without using java..
import java.util.Arrays;
import java.util.List;

interface predicate_two{
    public abstract boolean test(List numbers);
}
public class Test2 implements predicate_two{
    public boolean test(List numbers){
        return numbers.isEmpty();
    }
    public static void main(String[] args) {
        List <Integer> numbers=Arrays.asList(10,202,03,89,03);
        predicate_two p=new Test2();
        System.out.println(p.test(numbers));
        


    }
}