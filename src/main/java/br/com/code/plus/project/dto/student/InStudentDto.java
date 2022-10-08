package br.com.code.plus.project.dto.student;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InStudentDto {

    @ApiModelProperty(value = "Student's name")
    private String name;
    @ApiModelProperty(value = "Student's user name")
    private  String userName;
    @ApiModelProperty(value = "Student's email")
    private String email;
    @ApiModelProperty(value = "Student's password")
    private String password;
    @ApiModelProperty(value = "Student's phone")
    private String phone;

}
