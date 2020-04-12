package io.github.wemmelotec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
/*
essa anotacion força o escanemento nesse array de diretorios, mas por padrão o Spring já faz
esse escaneamento em todas os subdiretorios da projeto
 */
@ComponentScan(basePackages = {
        "io.github.wemmelotec.repository",
        "io.github.wemmelotec.servico",
        "com.umaoutrabiblioteca.projeto"})//esse é o único pacote que está fora do escopo padrão
@RestController
public class VendasApplication {
    /*
   ele explicará essa anotação mais na frente
   mas nesse momento vou utilizar para usar a minha Bean da classe MinhaConfiguration
   */
    @Autowired
    @Qualifier("applicationName")
    //essa anotação faz o spring injetar o resultado do método chamado nessa variavel abaixo
    private String applicationName;

    @GetMapping("/hello")//endpoint
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
