import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<String> name = List.of("Ivan", "Dima", "sofia", "Andriy", "Ivan", "Peter", "Mary", "John", "Alice");
        String nams = evennames(name);
        String nameOne = "1." + name.get(1) + ".";
        System.out.println(nameOne + nams);
    }

    public static String evennames(List<String> name) {
        return IntStream.range(0, name.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + "." + name.get(i))
                .collect(Collectors.joining("."));
    }
}