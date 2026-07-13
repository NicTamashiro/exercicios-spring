package br.com.nicolas.exercicios_spring.exe10;

public class Main {
    public static void main(String[] args) {
        VerificarPalindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("java"));
    }
}
