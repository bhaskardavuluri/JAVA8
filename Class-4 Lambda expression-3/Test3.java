interface Dao{
    static void login(){
        System.out.println("this is a static method used in interfaces from JAVA8");
    }
}
public class Test3{
    public static void main(String[] args) {
      Dao.login();
      
    }
}