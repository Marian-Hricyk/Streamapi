package taskTwo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tasko {
    public static void main(String[] args) {
        List<String> word=List.of("son","alvo","dano","andreq");
      List<String> sorte= word.stream()
                .map(i-> i.toUpperCase())
                .sorted(Comparator.reverseOrder())
               .peek(System.out::println)
              .collect(Collectors.toList());
    }
}
