package streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OnlyJava {

    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");

        System.out.println(names.stream().filter(name -> name.startsWith("A")).count());

        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.startsWith("A")).count();

        names.stream().filter(s -> s.length() > 4).forEach(System.out::println);
        System.out.println(names.stream().filter(s -> s.length() > 4).findFirst());
    }

    @Test
    public void anotherTest() {
        Stream<String> names = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama");
        names.filter(s -> s.endsWith("a")).map(name -> name.toUpperCase()).forEach(System.out::println);

        System.out.println();

        List<String> listNames = Arrays.asList("Az", "Ajax", "Abba", "Abhijeet", "Don", "Alekhya", "Adam", "Rama");
        listNames.stream().filter(s -> s.startsWith("A")).sorted().map(s-> s.toUpperCase()).forEach(System.out::println);

        System.out.println();

        ArrayList<String> schaken = new ArrayList<>();
        schaken.add("SC Assen");
        schaken.add("SISSA");
        schaken.add("LOS");
        schaken.add("Hoogeveen");
        schaken.add("Zwols SG");

        Stream<String> newStream = Stream.concat(listNames.stream(), schaken.stream());
        newStream.sorted().forEach(System.out::println);

        Stream<String> newStream2 = Stream.concat(listNames.stream(), schaken.stream());
        boolean flag = newStream2.anyMatch(s -> s.equalsIgnoreCase("adam"));

        System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Test
    public void streamCollect() {
        List<String> name = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama")
                .filter(s -> s.endsWith("a"))
                .map(String::toUpperCase)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(name);
    }
}
