package taskTwo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tasko {
    public static void main(String[] args) {
        List<String> word = List.of("son", "alvo", "dano", "andreq");
        System.out.println(word.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
