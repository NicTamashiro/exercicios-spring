package br.com.nicolas.exercicios_spring.exe1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Contador implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Contador.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Digite um numero para ver a contagem ate ele: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
    }
}
