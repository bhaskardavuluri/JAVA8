import java.util.Optional;

public class Testtwo {
    public static void main(String[] args) {
        String ename="rahul";
        Optional <String> opt=Optional.ofNullable(ename);
        if (opt.isPresent()){
            System.out.println(opt.get().length());  //handling the Nullpointpointer exception..
        }
        else {
            System.out.println("string is null");
        }
    }
}
