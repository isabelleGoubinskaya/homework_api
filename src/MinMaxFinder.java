import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MinMaxFinder {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer
    ) {
        Supplier<Stream<? extends T>> supplier = () -> stream;

        Optional<? extends T> min = supplier.get().min(order);
        Optional<? extends T> max = supplier.get().max(order);

        minMaxConsumer.accept(min.orElse(null), max.orElse(null));
    }
}
