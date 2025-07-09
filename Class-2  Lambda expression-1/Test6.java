//using lamda expression another example..i
interface Function_one{
 public abstract int add(int a ,int b);
}
public class Test6{
    public static void main(String[] args) {
        Function_one d=(a,b)->a+b;
        System.out.println(d.add(10, 20));
    }
}