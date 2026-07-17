package br.com.nicolas.exercicios_spring.exe38;

public class Main {
    public static void main(String[] args) {
        System.out.println(CodigoErro.NOT_FOUND.getCodigo()); // 404
        System.out.println(CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida
    }
}
