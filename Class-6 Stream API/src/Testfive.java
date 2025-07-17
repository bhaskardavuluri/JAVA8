import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//print the names startswith R. by using normal way[without using streams]
public class Testfive {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("Rahul","Raju","Surya","pinky");
        List <String> new_enames= new ArrayList<>();
        for(String s: enames){
            if (s.startsWith("R")){
                new_enames.add(s);
                System.out.println(new_enames);

            }
            //System.out.println(enames);


        }
    }
}
