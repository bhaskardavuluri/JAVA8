//another example for using pre defined interfaces..
@FunctionalInterface
interface Function_one{
    public abstract int sub(int a,int b);
}
public class Test7{
    public static void main(String[] args) {
        Function_one fo=(a,b)->a-b;    //using lamda expression..
        System.out.println(fo.sub(100, 50));
    }
} 