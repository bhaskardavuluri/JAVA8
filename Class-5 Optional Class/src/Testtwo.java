import java.util.Optional;

public class Testtwo {

        public static void main(String[] args) {
            String ename="balayya babu";
            Optional<String> opt=Optional.ofNullable(ename);
            if(opt.isPresent()){
                System.out.println(opt.get().length());
            }
            else{
                System.out.println("String is NUll");
            }
        }
    }


