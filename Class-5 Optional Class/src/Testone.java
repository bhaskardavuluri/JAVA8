import java.util.Optional;

public class Testone {
    public static void main(String[] args) {
        String ename=null;
        Optional <String> opt=Optional.ofNullable(ename);
        if(opt.isPresent()){
            System.out.println(opt.get().length());
        }
        else{
            System.out.println("String is NUll");
        }
    }
}
