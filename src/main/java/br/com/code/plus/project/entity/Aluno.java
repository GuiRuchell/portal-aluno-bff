package br.com.code.plus.project.entity;

import javax.persistence.*;

@Entity
@Table(name= "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Column(name= "nome", length = 200, nullable = true)
    private String nome;
    @Column(name= "email", length = 50, nullable = true)
    private String email;
    @Column(name= "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name= "telefone", length = 15, nullable = true)
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
