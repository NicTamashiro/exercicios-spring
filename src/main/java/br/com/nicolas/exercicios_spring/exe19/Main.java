package br.com.nicolas.exercicios_spring.exe19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
          new Pessoa("Nicolas", 18),
          new Pessoa("Joao", 12),
          new Pessoa("Caue", 20)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);

    }
}
