interface Function_two{
    public int apply(int num);
}
class Test3{
    public static void main(String[] args) {
        Function_two f=num->num*num;   //using lamda expression
        System.out.println(f.apply(12));
    }
}