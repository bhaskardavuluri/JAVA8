@FunctionalInterface
interface Hari{
     abstract void  login();
}
public class  Testthree {
     public static void main(String[] args) {
          Hari d=()->System.out.println("login succesfully");  //using lambda expression and without implementing the parent class 
          d.login();
     }
}