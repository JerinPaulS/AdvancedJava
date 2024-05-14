package lambdasstreams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.math.BigDecimal.ONE;

public class StreamsDemo {

    private List<String> strings = Arrays.asList("this", "is", "a",
            "list", "of", "strings");

    /** of is a factory method.
     * It is a static method in the clas that is used to produce an instance of that class
     * Collect method converts a stream into a collection
     * joining is a factory method
     * Reduction operation
     * */
    public String joinStream() {
        return Stream.of("this", "is", "a", "stream", "of", "strings")
                .collect(Collectors.joining(" "));
    }

    /** stream is a default method in collections interface */
    public String joinUpperCase() {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
    }

    public int getTotalLength() {
        return strings.stream()
                .collect(Collectors.summingInt(String::length));
    }

    /** iterate is a producer that takes a function */
    public double sumFirstNBigDecimals(int num) {
        return Stream.iterate(ONE, val -> val.add(ONE))
                .limit(num)
                .mapToDouble(BigDecimal::doubleValue)
                .sum();
    }

    /** generate is a producer that takes a supplier */
    public Double sumRandoms1(int num) {
        return Stream.generate(Math::random)
                .limit(num)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    public Double sumRandoms2(int num) {
        return Stream.generate(Math::random)
                .limit(num)
                .reduce((acc, n) -> {
                    System.out.printf("Acc=%s, n=%s%n", acc, n);
                    return acc + n;
                })
                .orElse(0.0);
    }

    public Double sumRandoms3(int num) {
        Random r = new Random();
        return r.doubles()
                .limit(num)
                .sum();
    }

}
