package br.com.nicolas.exercicios_spring.exe8;

public class Main {
    public static void main(String[] args) {
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i < Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));
        System.out.println(primo.verificarPrimo(12));
    }
}
