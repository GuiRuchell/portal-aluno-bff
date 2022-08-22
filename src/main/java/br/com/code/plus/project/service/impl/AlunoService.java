package br.com.code.plus.project.service.impl;

import br.com.code.plus.project.entity.Aluno;
import br.com.code.plus.project.repository.AlunoRepository;
import br.com.code.plus.project.service.AlunoInterface;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class AlunoService implements AlunoInterface {

    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno findAlunoById(Integer id) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado na base de dados"));

        return aluno;
    }

    @Override
    public Aluno insertAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno updateAluno(Integer id, Aluno aluno) {
        Aluno response = alunoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado na base de dados, não foi possivel atualizar"));

        return alunoRepository.save(response);
    }
    @Override
    public void deleteAluno(Integer id) {
        alunoRepository.deleteById(id);
    }
}
