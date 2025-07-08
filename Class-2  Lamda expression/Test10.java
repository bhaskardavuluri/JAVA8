import java.util.function.Predicate;

public class Test10 {
    public static void main(String[] args) {
        Predicate <String> obj=name->name.length()<7;  //it consists of test() method inside in it always 
        System.out.println(obj.test("udasya bhaskar "));   //example for pre defined predicate FT..
        System.out.println(obj.test("uday "));
    }
}
