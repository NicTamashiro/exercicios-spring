package br.com.nicolas.exercicios_spring.exe35;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));

    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(String::toLowerCase)
                .toList();
    }
}
