import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test3{
    public static void main(String[] args) {
        List <Integer> L=Arrays.asList(10,20,203,404,505);
        Function <List,Integer> F=num->num.size();
        System.out.println(F.apply(L));
        Predicate <List> P=num->num.isEmpty();
        System.out.println(P.test(L));
        Consumer <List> C=num->{
            for (Integer integer : L) {
                System.out.println(integer);
            }
        };
        C.accept(L);
        
    }
}