package br.com.code.plus.project.controller;

import br.com.code.plus.project.entity.Aluno;
import br.com.code.plus.project.service.impl.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> findAlunoById(@PathVariable Integer id) {
        Aluno aluno = alunoService.findAlunoById(id);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
}
