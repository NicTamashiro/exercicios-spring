## Exercicios - Spring

1 - Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário.

Por exemplo, se o usuário digitar 5, deve aparecer no terminal 1 2 3 4 5 .

2 - Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca Gson no nosso projeto ScreenMatch. Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca são diferentes do que já foi feito antes. Explique quais passos você iria realizar nesse caso.

3 - Agora iremos trabalhar com serialização e desserialização. Para isso, você pode reaproveitar seu projeto do exercício 1. Adicione a dependência do Jackson ao seu pom.xml, pois iremos utilizá-la bastante nos próximos exercícios. Também crie uma classe Tarefa, com os seguintes atributos:


Copiar
public class Tarefa {
private String descricao;
private boolean concluida;
private String pessoaResponsavel;
}

Para que o Jackson funcione corretamente, é importante que sua classe tenha todos os getters e um construtor padrão. Também é legal criar um método toString().

4 - Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo. Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa. Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").

5 - Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do arquivo tarefa.json, produzido no exercício anterior, e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do objeto na tela.

6 - Vamos criar objetos genéricos. Imagine que você trabalha em um site que oferece várias coisas: venda de produtos, serviços de instalação desses produtos e assinatura de alguns itens. Todas essas coisas têm algo em comum: podem ser avaliadas pelos consumidores. Crie uma classe genérica de Avaliação, de modo que possamos ter, por exemplo: Avaliacao<Servico>, Avaliacao<Produto> e Avaliacao<Assinatura>. Essa classe deve ter o item genérico de avaliação, a nota e um comentário sobre a nota.

Tendo criado a classe genérica, você também pode criar um método para calcular as médias das notas recebidas, independente do tipo de item avaliado.

---

7 - Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser implementada dentro de uma interface funcional com o método multiplicacao(int a, int b).

8 - Implemente uma expressão lambda que verifique se um número é primo.

9 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

10 - Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão deve ser implementada dentro de uma interface funcional com o método boolean verificarPalindromo(String str). Dica: utilize o método reverse da classe StringBuilder.

11 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista onde cada número foi multiplicado por 3. Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

12 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

13 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

---

14 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

```public class Main {
public static void main(String[] args) {
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
// código para filtragem.
}
}
```


15 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
````
public class Main {
public static void main(String[] args) {
List<String> palavras = Arrays.asList("java", "stream", "lambda");
// código para conversão
}
````
16 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.
````
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código para filtragem e coleta
    }

````

17 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.
````
public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        // código da filtragem 
    }
}
````

18 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.
````
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
        );

    //código para filtrar e ordenar números primos
    }
}
````

19 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
````
public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Alice", 22),
            new Pessoa("Bob", 17),
            new Pessoa("Charlie", 19)
        );

    // código para filtrar pessoas
    }
}
````

20 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

Produto.java

````
public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", categoria='" + categoria + '\'' +
               '}';
    }
}


public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
        );

        // código para filtrar os produtos
    }
}
````

21 - Tomando o mesmo código do exercício anterior como base, modifique o código para que a saída mostre apenas os três produtos mais baratos da categoria "Eletrônicos".

