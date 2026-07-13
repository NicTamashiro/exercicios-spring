package br.com.nicolas.exercicios_spring.exe7;

public class Main {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println("Resultado = " + multiplicacao.multiplicacao(5, 4));
    }
}
