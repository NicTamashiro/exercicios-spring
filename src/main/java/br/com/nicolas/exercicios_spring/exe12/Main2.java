package br.com.nicolas.exercicios_spring.exe12;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Joao", "Arthur", "Nicolas", "Caue"));
        strings.sort(String::compareTo);
        System.out.println(strings);
    }
}
