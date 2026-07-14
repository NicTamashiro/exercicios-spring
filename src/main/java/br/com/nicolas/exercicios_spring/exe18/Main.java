package br.com.nicolas.exercicios_spring.exe18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
          Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(Main::ehPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numerosPrimos);


    }

    private static boolean ehPrimo(int numero){
        if(numero < 2) return false;
        for (int i = 2; i < Math.sqrt(numero); i++){
            if(numero % i == 0) return false;
        }
        return true;
    }
}
