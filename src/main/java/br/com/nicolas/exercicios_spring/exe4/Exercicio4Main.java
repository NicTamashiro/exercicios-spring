package br.com.nicolas.exercicios_spring.exe4;

import br.com.nicolas.exercicios_spring.exe3.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

@SpringBootApplication
public class Exercicio4Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Exercicio4Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tarefa tarefa = new Tarefa("Assitir aula 1", false, " Joao");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("tarefa.json"), tarefa);
        System.out.println("Dados salvos no arquivo tarefa.json");
    }
}
