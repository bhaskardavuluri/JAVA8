import java.util.function.Function;

public class Test9{
    public static void main(String[] args) {
        Function <Integer,Integer> obj=num->num*num;    //Function pre defined Ft consists of apply() method inside it 
        System.out.println(obj.apply(10));
    }
}