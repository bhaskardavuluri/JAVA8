import java.util.Optional;

public class Main{

        public static void main(String[] args) {
            String ename="Rahul";
            Optional<String> opt= Optional.ofNullable(ename);
            if(opt.isPresent()){
                System.out.println(opt.get().length());
            }
            else{
                System.out.println("String is Nulll");
            }

        }
    }
