import java.util.function.Consumer;

public class Test12 {
    public static void main(String[] args) {
        Consumer <String> obj=name->name.length();
    obj.accept("hi");  //iot only accepts ehatever we are giving 
    //System.out.println(obj.accept("hi"));  //print statement is not valid here..
    }
}
