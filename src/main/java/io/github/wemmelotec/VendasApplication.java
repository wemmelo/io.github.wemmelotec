package io.github.wemmelotec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Essa anotação faz com que o Spring reconheça que essa classe vai ser responsavél
//por levantar minha aplicação
@SpringBootApplication
public class VendasApplication {
    public static void main(String[] args) {
        //comando para inicializar a aplicação spring boot
        //o método run recebe dois parametros
        //a classe que vai inicializar que é a classe que tem a anotação @SpringBootApplication
        //e o segundo são os argmentos que já estamos recebendo do método main
        SpringApplication.run(VendasApplication.class, args);

    }
}
