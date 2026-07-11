package br.com.nicolas.exercicios_spring.exe5;

import br.com.nicolas.exercicios_spring.exe3.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

@SpringBootApplication
public class DesserializacaoArquivo implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DesserializacaoArquivo.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Tarefa tarefa = mapper.readValue(new File("tarefa.json"), Tarefa.class);
        System.out.println("Tarefa lida do JSON:");
        System.out.println(tarefa);
    }
}
