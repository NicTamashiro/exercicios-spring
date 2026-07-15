package br.com.nicolas.exercicios_spring.exe29;

import java.lang.classfile.Opcode;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = Arrays.asList(
                new Product("Smartphone", 800.0, "Eletrônicos"),
                new Product("Notebook", 1500.0, "Eletrônicos"),
                new Product("Teclado", 200.0, "Eletrônicos"),
                new Product("Cadeira", 300.0, "Móveis"),
                new Product("Monitor", 900.0, "Eletrônicos"),
                new Product("Mesa", 700.0, "Móveis")
        );

        Map<String, Optional<Product>> maxOfCategory = produtos.stream()
                .collect(Collectors.groupingBy(Product::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPreco))));

        System.out.println(maxOfCategory);
    }
}
