package br.edu.aluno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mesa {
    private int id;
    private String nome;

    private List<Jogador> jogadores = new ArrayList<>();
    private List<Participacao> participacoes = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();

    public Mesa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> listarJogadores() {
        return jogadores;
    }

    public void adicionarParticipacao (Participacao participacao) {
        participacoes.add(participacao);
    }

    public List<Participacao> listarParticipacoes() {
        return participacoes;
    }

    public Sessao criarSessao(int id, Date data, String descricao) {
        Sessao sessao = new Sessao(id, data, descricao);
        sessoes.add(sessao);
        return sessao;
    }

    public List<Sessao> listarSessao() {
        return sessoes;
    }
}
