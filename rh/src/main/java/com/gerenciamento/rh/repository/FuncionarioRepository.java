package com.gerenciamento.rh.repository;


import com.gerenciamento.rh.model.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, String> {

}
