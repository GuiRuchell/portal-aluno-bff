package br.com.code.plus.project.controller;

import br.com.code.plus.project.dto.student.InStudentDto;
import br.com.code.plus.project.dto.student.OutStudentDto;
import br.com.code.plus.project.service.impl.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/aluno")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OutStudentDto> findAlunoById(@PathVariable Integer id) {
        OutStudentDto outStudentDto = studentService.findStudentById(id);
        return new ResponseEntity<>(outStudentDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OutStudentDto> createAluno(@RequestBody InStudentDto inStudentDto) {
        OutStudentDto outStudentDto = studentService.insertStudent(inStudentDto);
        return new ResponseEntity<>(outStudentDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OutStudentDto> updateAluno(@PathVariable Integer id, @RequestBody InStudentDto inStudentDto) {
        OutStudentDto outStudentDto = studentService.updateStudent(id, inStudentDto);
        return new ResponseEntity<>(outStudentDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteAluno(@PathVariable Integer id){
       studentService.deleteStudent(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
