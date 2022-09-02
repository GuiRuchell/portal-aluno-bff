package br.com.code.plus.project.service.impl;

import br.com.code.plus.project.dto.student.InStudentDto;
import br.com.code.plus.project.dto.student.OutStudentDto;
import br.com.code.plus.project.entity.Student;
import br.com.code.plus.project.mapper.StudentMapper;
import br.com.code.plus.project.repository.StudentRepository;
import br.com.code.plus.project.service.StudentInterface;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class StudentService implements StudentInterface {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public OutStudentDto findStudentById(Integer id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado na base de dados"));

        return studentMapper.OutRegistrationDtoToRegistration(student);
    }

    @Override
    public OutStudentDto insertStudent(InStudentDto inStudentDto) {
        Student student = studentMapper.inRegistrationDtoToRegistration(inStudentDto);
        return studentMapper.OutRegistrationDtoToRegistration(studentRepository.save(student));
    }

    @Override
    public OutStudentDto updateStudent(Integer id, InStudentDto inStudentDto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado na base de dados, não foi possivel atualizar"));

        return studentMapper.OutRegistrationDtoToRegistration(studentRepository.save(student));
    }
    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
