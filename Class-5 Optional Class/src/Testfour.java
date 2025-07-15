import java.util.Optional;
public class Testfour {
    public static void main(String[] args) {
        // Creating an empty Optional
        Optional<String> emptyOpt = Optional.empty();

        // Check if value is present
        if (emptyOpt.isPresent()) {
            System.out.println("Value: " + emptyOpt.get());
        } else {
            System.out.println("No value present");
        }

        // Provide default value using orElse
        String value = emptyOpt.orElse("Default Value");
        System.out.println("Value from orElse: " + value);
    }
}

