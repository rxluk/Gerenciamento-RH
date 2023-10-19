package com.gerenciamento.rh.controller;

import com.gerenciamento.rh.model.Funcionario;
import com.gerenciamento.rh.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rh")
public class FuncionarioRestController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<Iterable<Funcionario>> buscarTodos() {
        return ResponseEntity.ok(funcionarioService.buscarTodos());
    }
    @GetMapping("/{cpf}")
    public ResponseEntity<Funcionario> buscarporCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(funcionarioService.buscaPorCpf(cpf));
    }
    @PostMapping
    public ResponseEntity<Funcionario> inserir(@RequestBody Funcionario funcionario) {
        funcionarioService.inserir(funcionario);
        return ResponseEntity.ok(funcionario);
    }
    @PutMapping("/{cpf}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable String cpf, @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(cpf, funcionario);
        return ResponseEntity.ok(funcionario);
    }
    @DeleteMapping("/{cpf}")
    public ResponseEntity<Funcionario> deletar(@PathVariable String cpf) {
        funcionarioService.deletar(cpf);
        return ResponseEntity.ok().build();
    }
}
