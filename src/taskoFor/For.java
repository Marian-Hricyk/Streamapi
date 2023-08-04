package taskoFor;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class For {
    public static void main(String[] args) {
        Random random = new Random();

        Stream<Integer> algo = Stream.iterate(11, (seed) -> random.whtSeed(seed).next());
        algo.filter(i -> i > 10)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}

