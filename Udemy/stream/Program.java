package Udemy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        st1.forEach(System.out::println);
        System.out.println(st1);

        Stream<String> st2 = Stream.of("Maria", "alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> finonacciSequencia = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(finonacciSequencia.limit(10).toArray()));

        List<Integer> newList = list.stream().filter(item -> item % 2 == 0).map(item -> item * 20).toList();
        newList.forEach(System.out::println);
    }
}
