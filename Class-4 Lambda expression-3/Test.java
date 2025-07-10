//supplier example

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Integer> s1 = ()->100;       //pre defined functional interface Supplier..
        Supplier<String> s2 = ()->"Rahul";   //pre defined functional interface Supplier..
        Supplier<Boolean> s3 = ()->100>200;   //pre defined functional interface Supplier..

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());
    }
}