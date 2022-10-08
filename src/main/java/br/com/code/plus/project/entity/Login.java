package br.com.code.plus.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "login")
public class Login {

    @Column(name= "user_name", length = 200, nullable = true)
    private String userName;
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String password;
}
