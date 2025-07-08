interface Function_one{
    public abstract  int squareit(int num);
}
class Test2 implements Function_one{
    public  int squareit(int num){
        return num*num;
    }
    public static void main(String[] args) {
        Function_one obj=new Test2();      //normal java code 
        System.out.println(obj.squareit(12));        
    }
}