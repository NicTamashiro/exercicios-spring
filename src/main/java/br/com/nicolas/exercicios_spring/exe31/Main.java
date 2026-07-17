package br.com.nicolas.exercicios_spring.exe31;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = input.stream()
                .map(str -> {
                  try {
                      return Optional.of(Integer.parseInt(str));
                  } catch (NumberFormatException e){
                      return Optional.<Integer>empty();
                  }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

        System.out.println(numeros);
    }
}
