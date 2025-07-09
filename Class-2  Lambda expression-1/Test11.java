//another example for predicate pre defined FT..

import java.util.function.Predicate;  //Test method is always there 

public class Test11{
    public static void main(String[] args) {
        Predicate <String> obj=name->name.length()>6;
        System.out.println(obj.test("balayya babu"));
    }
}