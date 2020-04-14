package io.github.wemmelotec.service;

import io.github.wemmelotec.model.Cliente;
import io.github.wemmelotec.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
essa é a classe que tem toda a regra de negócio
que gera os relatórios
que gera as validações
que tem o objeto que acessa a base de dados
 */
@Service
public class ClientesService {
    @Autowired
    private ClientesRepository repository;//essa é a variável que vai receber o objeto
    //essa é o método para injetar nessa classe o ClientesRepository
    //@Autowired//essa a anotacion que faz o Spring injetar
    //eu posso também apagar todo esse construtor e injetar apenas colocando a anotacion em cima da variavel
    /*public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }*/

    public void salvarClientes(Cliente cliente){
        validarCliente(cliente);
        //para não utilizar essa linha debaixo que pode estourar o meu banco
        //eu faço uma injeção do ClientesRepository utilizando o Container do Spring via construtor
        //ClientesRepository clientesRepository = new ClientesRepository();//esse é o objeto que vem da classe ClientesRepository
        //clientesRepository.persistir(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplicar validações
    }
}
