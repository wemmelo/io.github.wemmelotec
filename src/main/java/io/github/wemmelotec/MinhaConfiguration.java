package io.github.wemmelotec;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//essa anotação informa ao spring que essa é uma classe de configuração
@Configuration
public class MinhaConfiguration {
    //e as configurações são realizadas através de beans

    @Bean(name = "applicationName")
    /*
    Esse Bean está falando para o spring criar esse objeto no contexto da aplicação
    assim eu posso utilizar ele onde eu precisar
     */
    public String applicationName(){
        return "Sistemas de vendas";
    }
}
