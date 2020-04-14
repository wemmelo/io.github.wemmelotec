package io.github.wemmelotec.repository;


import io.github.wemmelotec.model.Cliente;
import org.springframework.stereotype.Repository;
/*
aqui tem o objeto que acessa a base de dados diretamente
que faz as operações diretamente na base
 */
@Repository
public class ClientesRepository {


    public void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
    }
}
