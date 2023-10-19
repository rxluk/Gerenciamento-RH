package com.gerenciamento.rh.service.serviceImpl;

import com.gerenciamento.rh.model.Funcionario;
import com.gerenciamento.rh.repository.FuncionarioRepository;
import com.gerenciamento.rh.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Iterable<Funcionario> buscarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario buscaPorCpf(String cpf) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(cpf);
        return funcionarioOptional.orElse(null);
    }

    public void inserir(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public void atualizar(String cpf, Funcionario funcionario) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(cpf);
        if(funcionarioOptional.isPresent()) funcionarioRepository.save(funcionario);
    }

    public void deletar(String cpf) {
        funcionarioRepository.deleteById(cpf);
    }
}
