//lamda expression-no return type,no method name ,no access modifier ..
//how to execute lamda expression-using:1)using user defined interfaces 2)pre-defined interfaces,,
//example without using lamda expression..
interface   Function_one{
 public abstract int add (int a,int b);

}
class Test implements Function_one{
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Function_one f=new Test();
        f.add(101,102 );
        System.out.println(f.add(10,20));
    
    }


}