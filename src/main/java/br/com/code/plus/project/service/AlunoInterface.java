package br.com.code.plus.project.service;

import br.com.code.plus.project.entity.Aluno;

public interface AlunoInterface {

    Aluno findAlunoById(Integer id);
    Aluno insertAluno(Aluno aluno);
    Aluno updateAluno(Integer id, Aluno aluno);
    void deleteAluno(Integer id);
}
