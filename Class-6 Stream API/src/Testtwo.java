import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testtwo {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("rahul","sunil","balayya");
        List<String> new_enames=new ArrayList<String>();
        for (String ename:enames){
            new_enames.add(ename.toUpperCase());
        }
        System.out.println(enames);
        System.out.println(new_enames);
    }
}
