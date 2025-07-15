import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        ArrayList<Integer> even_no=new ArrayList<Integer>();
        ArrayList<Integer> odd_no=new ArrayList<Integer>();
        for (Integer num:numbers){
            if(num%2==0){
                even_no.add(num);
            }
            else {
                odd_no.add(num);
            }

        }
        System.out.println(numbers);
        System.out.println(even_no);
        System.out.println(odd_no);


        }

}