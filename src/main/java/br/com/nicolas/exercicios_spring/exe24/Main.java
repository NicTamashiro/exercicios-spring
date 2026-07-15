package br.com.nicolas.exercicios_spring.exe24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String grouped = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(grouped);
    }
}
