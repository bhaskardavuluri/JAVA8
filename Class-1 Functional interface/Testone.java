@FunctionalInterface
interface Dao{
   public  abstract void login();   
   
}
class DaoImpl implements Dao{
    public void login(){
        System.out.println("login successfully");
    }
    // public void logout(){
        // System.out.println("logout succesfully");   //we cannot declare 2 methods when we use the functional interface..
    
}

    public class Testone{
        public static void main(String[] args) {
           Dao d= new DaoImpl();
           d.login(); 
           
            
    }
}

