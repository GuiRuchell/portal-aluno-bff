package br.com.code.plus.project.controller;

import br.com.code.plus.project.dto.student.InStudentDto;
import br.com.code.plus.project.dto.student.OutStudentDto;
import br.com.code.plus.project.service.impl.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation(value = "Responsible for searching the student through the id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Return student by id"),
            @ApiResponse(code = 401, message = "You do not have permission to access this feature."),
            @ApiResponse(code = 500, message = "An exception was generated"),
    })
    @GetMapping("/{id}")
    public ResponseEntity<OutStudentDto> findAlunoById(@PathVariable Integer id) {
        OutStudentDto outStudentDto = studentService.findStudentById(id);
        return new ResponseEntity<>(outStudentDto, HttpStatus.OK);
    }

    @ApiOperation(value = "Responsible for creating students")
    @PostMapping
    public ResponseEntity<OutStudentDto> createAluno(@RequestBody InStudentDto inStudentDto) {
        OutStudentDto outStudentDto = studentService.insertStudent(inStudentDto);
        return new ResponseEntity<>(outStudentDto, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Responsible for updating students")
    @PutMapping("/{id}")
    public ResponseEntity<OutStudentDto> updateAluno(@PathVariable Integer id, @RequestBody InStudentDto inStudentDto) {
        OutStudentDto outStudentDto = studentService.updateStudent(id, inStudentDto);
        return new ResponseEntity<>(outStudentDto, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Responsible for deleting students")
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteAluno(@PathVariable Integer id){
       studentService.deleteStudent(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
