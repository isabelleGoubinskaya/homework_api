import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Create a stream of integers
        Stream<Integer> intStream = Stream.of(3, 5, 1, 6, 2);

        // Call findMinMax method with the stream and a comparator
        MinMaxFinder.findMinMax(
                intStream,
                Comparator.naturalOrder(),
                (min, max) -> {
                    System.out.println("Minimum element: " + min);
                    System.out.println("Maximum element: " + max);
                }
        );
    }
}
