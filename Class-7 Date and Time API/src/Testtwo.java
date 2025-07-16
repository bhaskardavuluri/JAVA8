import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//calculating the age by using Date and time
public class Testtwo {
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2008,7,7);
        LocalDate today=LocalDate.now();
        Period age= Period.between(dob,today);
        System.out.println(age.getYears());
        System.out.println(age.getMonths());
        System.out.println(age.getDays());
        
    }

}
