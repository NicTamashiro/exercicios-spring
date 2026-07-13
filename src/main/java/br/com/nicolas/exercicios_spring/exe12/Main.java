package br.com.nicolas.exercicios_spring.exe12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Joao", "Arthur", "Nicolas", "Caue"));
        strings.sort((a, b) -> a.compareTo(b));
        System.out.println(strings);
    }
}
