//lamda expression -no method,no return type,no accessmodifier is called as lamda expression,no return keyword..
//without lamda example
@FunctionalInterface
interface Dao{
    public abstract void login();
}
 class  DaoImpl implements Dao{
 public void login(){
    System.out.println("login succesfully");
 }
}
public class Testtwo{
 public static void main(String[] args) {
    Dao dao=new DaoImpl();
    dao.login();
 }
}
         
    
