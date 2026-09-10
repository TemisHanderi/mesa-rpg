package br.edu.aluno;

import java.util.Date;

public class Sessao {
    private int id;

    private Date data;
    private String descricao;

    public Sessao(int id, Date data, String descricao) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
    }
}
