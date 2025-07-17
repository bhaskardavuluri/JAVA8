import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//print the name starts with R by using streams..
public class Testfour {
    public static void main(String[] args) {
        List <String> enames= Arrays.asList("RG","SG","AS","RS");
        List <String> new_enames=enames.stream()
                .filter(ename->ename.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(enames);
        System.out.println(new_enames);
    }
}
