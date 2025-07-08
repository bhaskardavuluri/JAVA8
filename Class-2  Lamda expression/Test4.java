interface Function_one{
    public abstract int add (int a ,int b);

    }
    class Test4 implements Function_one{
        public  int add(int a, int b){
            return a+b;

        }
        public static void main(String[] args) {
            Function_one f=new Test4();               
            System.out.println(f.add(20, 50));
        }         //this is using normal java code..
    }
