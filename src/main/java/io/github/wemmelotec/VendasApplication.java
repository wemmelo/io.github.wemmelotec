package io.github.wemmelotec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class VendasApplication {
    /*
   ele explicará essa anotação mais na frente
   mas nesse momento vou utilizar para usar a minha Bean da classe MinhaConfiguration
   */
    @Autowired
    @Qualifier("applicationName") //essa anotação faz o spring injetar o resultado do método chamado nessa variavel abaixo
    private String applicationName;

    @GetMapping("/hello")//endpoint
    public String helloWorld(){
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
