package taskoThre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Thre {
    public static void main(String[] args) {
        String[] err = new String[]{"1, 2, 0", "4, 5"};
        String result = Arrays.stream(err)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
