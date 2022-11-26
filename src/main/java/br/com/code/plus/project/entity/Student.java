package br.com.code.plus.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "aluno")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome_completo", length = 200)
    private String name;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "senha", columnDefinition = "TEXT")
    private String password;
    @Column(name = "telefone", length = 15)
    private String phone;

}
