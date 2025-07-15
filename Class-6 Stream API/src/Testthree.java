import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Testthree {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("balayya");
        enames.add("bhaskar");
        List<String> new_enames=enames.stream()
                .map(ename->ename.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(enames);
        System.out.println(new_enames);
    }

}
