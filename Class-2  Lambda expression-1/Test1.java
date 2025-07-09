@FunctionalInterface
interface Function_two{
    public abstract int add(int a ,int b);

}
class Test1{
    public static void main(String[] args) {
        Function_two f=(a,b)->a+b;
        System.out.println(f.add(10, 20));  //using lambda expression..
    }
}