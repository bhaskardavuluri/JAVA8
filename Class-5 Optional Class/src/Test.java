import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String ename="Bhaskar";
        Optional <String> opt=Optional.ofNullable(ename);
        if(opt.isPresent()){
            System.out.println(opt.get());

        }
        else{
            System.out.println("String is null");
        }
    }
}
