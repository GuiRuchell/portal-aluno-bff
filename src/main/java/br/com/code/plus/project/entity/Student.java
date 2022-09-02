package br.com.code.plus.project.entity;

import javax.persistence.*;

@Entity
@Table(name= "aluno")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;
    @Column(name= "nome_completo", length = 200, nullable = true)
    private String name;
    @Column(name= "email", length = 50, nullable = true)
    private String email;
    @Column(name= "senha", columnDefinition = "TEXT", nullable = true)
    private String password;
    @Column(name= "telefone", length = 15, nullable = true)
    private String phone;

    public Student(Integer id, String name, String email, String password, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
