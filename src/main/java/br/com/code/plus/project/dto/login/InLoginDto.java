package br.com.code.plus.project.dto.login;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InLoginDto {

    @ApiModelProperty(value = "Student's user name")
    private String userName;
    @ApiModelProperty(value = "Student's password")
    private String password;

}
