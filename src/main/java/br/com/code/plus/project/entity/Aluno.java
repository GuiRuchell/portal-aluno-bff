package br.com.code.plus.project.entity;

import javax.persistence.*;

@Entity
@Table(name= "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;
    @Column(name= "nome_completo", length = 200, nullable = true)
    private String nome;

    @Column(name= "user_name", length = 200, nullable = true)
    private String userName;
    @Column(name= "email", length = 50, nullable = true)
    private String email;
    @Column(name= "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name= "telefone", length = 15, nullable = true)
    private String telefone;

    public Aluno(Integer id, String nome, String userName, String email, String senha, String telefone) {
        this.id = id;
        this.nome = nome;
        this.userName = userName;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Aluno() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
