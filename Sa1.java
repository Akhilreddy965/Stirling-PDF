import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

        // Using Streams to filter names that start with "C" and convert to uppercase
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))   // Filter names starting with 'C'
                .map(String::toUpperCase)               // Convert to uppercase
                .collect(Collectors.toList());          // Collect results into a list

        // Output result
        System.out.println(filteredNames);  // Output: [CHARLIE]
    }
}
