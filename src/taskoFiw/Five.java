package taskoFiw;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Five {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream1 = Stream.of(7, 6, 5, 4, 3, 2, 1);

        Stream<Integer> zippedStream = zip(stream1, stream);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        List<T> list = new LinkedList<>();

        while (iteratorSecond.hasNext() && iteratorFirst.hasNext()) {
            list.add(iteratorSecond.next());
            list.add(iteratorFirst.next());
        }
        Collections.shuffle(list);
        Stream<T> mixedUp;
        return mixedUp = list.stream();
    }


}
