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
        Aluno user = alunoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado na base de dados"));

        return user;
    }
}
