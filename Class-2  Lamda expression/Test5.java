//userdefined INterface example
@FunctionalInterface
interface Function_one{
    public  abstract void Login();
         
}
 public class Test5 {
      public static void main(String[] args) {
        Function_one F=()->System.out.println("lOGIN SUCCESFULLY");  //lamda expression
        F.Login();
      }
        
    }
