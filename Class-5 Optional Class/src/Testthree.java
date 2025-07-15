import java.util.Optional;

public class Testthree {
    public static void main(String[] args) {
//        String ename="balayya";
        Optional<String > opt=Optional.of("hello");
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
        else{
            System.out.println("String is null");
        }
    }
}
