package streamAPIDemo;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {

    public static void main(String[] args) {

        //Create a Stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //Create a stream from diff sources
        Collection<String> collection = Arrays.asList("Java","Python","C#");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        List<String> list = Arrays.asList("Java","Python","C#");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

    }
}
