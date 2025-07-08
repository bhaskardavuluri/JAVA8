import java.util.function.Function;

public class Test8{
    public static void main(String[] args) {
        Function <Integer,Integer> obj=num->num*num;   //example for Function pre-defind FT..

        System.out.println(obj.apply(12));            //Function pre defined Ft consists of apply() method inside it 
    
    }
}