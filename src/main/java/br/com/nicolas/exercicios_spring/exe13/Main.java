package br.com.nicolas.exercicios_spring.exe13;

public class Main {
    public static void main(String[] args) {
        Divisor divisao = (a, b) -> {
          if (b == 0) throw new ArithmeticException("Nao pode dividir por '0'.");
          return a / b;
        };

        try {
            System.out.println(divisao.dividir(10, 2));
            System.out.println(divisao.dividir(10, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
