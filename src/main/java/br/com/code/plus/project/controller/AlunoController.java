package br.com.code.plus.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @GetMapping("/aluno")
    public String texto () {
        return "Está tudo ok";
    }
}
