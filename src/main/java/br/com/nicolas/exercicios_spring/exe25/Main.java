package br.com.nicolas.exercicios_spring.exe25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1,2,3,4,5,6);
        int sumOfSquaresOfEvenNumbers = names.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquaresOfEvenNumbers);
    }
}
