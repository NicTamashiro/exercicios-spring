package br.com.nicolas.exercicios_spring.exe11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}
