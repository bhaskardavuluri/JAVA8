import java.util.function.Supplier;

interface Supplier_one{
    public abstract boolean get();
}
class Demo{
    public static void main(String[] args) {
        Supplier<Integer> s1=()->100;  //pre-defined functional interface..
        System.out.println(s1.get());
        Supplier_one s2=()->100>200; //User-defined functional interface 
        System.out.println(s2.get());
    }
}