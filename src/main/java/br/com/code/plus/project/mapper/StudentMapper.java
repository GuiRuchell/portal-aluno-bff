package br.com.code.plus.project.mapper;

import br.com.code.plus.project.dto.student.InStudentDto;
import br.com.code.plus.project.dto.student.OutStudentDto;
import br.com.code.plus.project.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class StudentMapper {

    public static final StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    public abstract Student inRegistrationDtoToRegistration(InStudentDto inStudentDto);

    public abstract OutStudentDto OutRegistrationDtoToRegistration(Student student);

}
