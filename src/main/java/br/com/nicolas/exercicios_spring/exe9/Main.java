package br.com.nicolas.exercicios_spring.exe9;

public class Main {
    public static void main(String[] args) {
        ConverteParaMaiusculas converteParaMaiusculas = s -> s.toUpperCase();

        System.out.println("Texto em Maiusculas: " + converteParaMaiusculas.converteMaiuscula("Nicolas"));

    }
}
