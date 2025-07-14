//By using lamda expression
@FunctionalInterface
interface Dao{
  void login();
}
public class DaoImpl{
    public static void main(String[] args) {
        Dao dao=()->System.out.println("Login successfully");  //lamda expressions..
        dao.login();
    }
        
    }
     