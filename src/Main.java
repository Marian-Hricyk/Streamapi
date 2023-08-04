import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<String> name = List.of("Ivan", "Dima", "sofia", "Andriy", "Ivan", "Peter", "Mary", "John", "Alice");

        System.out.println(evennames(name));
    }

    public static String evennames(List<String> name) {
        return IntStream.range(0, name.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + "." + name.get(i))
                .collect(Collectors.joining(", "));
    }
}