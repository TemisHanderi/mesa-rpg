package br.edu.aluno;

import java.util.Date;

public class Participacao {
    private String papel;
    private Date dataEntrada;
    private Jogador jogador;
    private Personagem personagem;

    public Participacao(String papel, Date dataEntrada, Jogador jogador, Personagem personagem) {
        this.papel = papel;
        this.dataEntrada = dataEntrada;
        this.jogador = jogador;
        this.personagem = personagem;
    }

    public String getPapel() { return this.papel; }

    public Date getDataEntrada() { return this.dataEntrada; }

    public Jogador getJogador() { return jogador; }

    public Personagem getPersonagem() { return personagem; }
}
