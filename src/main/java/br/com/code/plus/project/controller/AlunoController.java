package br.com.code.plus.project.controller;

import br.com.code.plus.project.entity.Aluno;
import br.com.code.plus.project.service.impl.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        Aluno response = alunoService.insertAluno(aluno);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Integer id, @RequestBody Aluno aluno) {
        Aluno response = alunoService.updateAluno(id, aluno);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteAluno(@PathVariable Integer id){
       alunoService.deleteAluno(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
