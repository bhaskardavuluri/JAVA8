import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
    public static void main(String[] args) {
        Function<String,Boolean> f=(ename)->ename.length()>5;   //pre-defined Functional interfaces..
        System.out.println(f.apply("rahul"));

        Predicate<Integer> p=(price)->price>=10000;             //pre-defined Functional interfaces..
        System.out.println(p.test(1000));

        Consumer<String>  c=(ename)->{                          //pre-defined Functional interfaces..
            System.out.println(ename.toLowerCase());
        };
        c.accept("RAHUL");

        Supplier<Integer>  s=()->1000;                          //pre-defined Functional interfaces..
        System.out.println(s.get());
    }
}
