package com.gerenciamento.rh.service;

import com.gerenciamento.rh.model.Funcionario;

public interface FuncionarioService {

    Iterable<Funcionario>buscarTodos();
    Funcionario buscaPorCpf(String cpf);
    void inserir(Funcionario funcionario);
    void atualizar(String cpf, Funcionario funcionario);
    void deletar(String cpf);
}
