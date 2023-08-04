package streamAPIDemo;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamCountMaxMinDemo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10,20,30,40,50);
        System.out.println(stream.count());

        Integer minInteger = Stream.of(10,20,30,40,50).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min => " + minInteger);

        Integer maxInteger = Stream.of(10,20,30,40,50).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max => " + maxInteger);

    }
}
