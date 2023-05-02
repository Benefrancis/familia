package br.com.benefrancis.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {

    protected Long id;

    protected String nome;

    protected LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, LocalDate nascimento) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Long getId() {
        return id;
    }

    public Pessoa setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Pessoa setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (Objects.isNull(o)) return false;

        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;

        if (Objects.isNull(this.getId())) return false;

        return getId().equals(pessoa.getId());
    }
}
