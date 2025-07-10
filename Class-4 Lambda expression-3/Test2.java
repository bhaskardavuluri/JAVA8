interface b{     
    public abstract void login();
    public abstract void logout();
    public default void Show(){                      //from JAVA8 onwards we are having default methods in the interface..
        System.out.println("jai balayya");
    }

}
class Dao implements b{
    public  void login(){
        System.out.println("login successfully ");
    }
    public void logout(){
        System.out.println("logged out successfully");
    }

}
class Dao1 implements b{
    public  void login(){
        System.out.println("login successfully ");
    }
    public void logout(){
        System.out.println("logged out successfully");
    }

}
public class Test2{
    public static void main(String[] args) {
      b d =new Dao();
      d.login();
      d.logout();
      d.Show();
      b e=new Dao1();
      e.login();
      e.logout();
      e.Show();
    }

}