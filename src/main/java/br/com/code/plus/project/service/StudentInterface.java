package br.com.code.plus.project.service;

import br.com.code.plus.project.dto.student.InStudentDto;
import br.com.code.plus.project.dto.student.OutStudentDto;

public interface StudentInterface {

    OutStudentDto findStudentById(Integer id);
    OutStudentDto insertStudent(InStudentDto inStudentDto);
    OutStudentDto updateStudent(Integer id, InStudentDto inStudentDto);
    void deleteStudent(Integer id);
}
