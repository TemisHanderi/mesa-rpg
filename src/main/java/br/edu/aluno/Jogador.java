package br.edu.aluno;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int id;
    private String nome;
    private final List<Personagem> personagens;

    public Jogador(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) { this.personagens.add(personagem); }

    public Personagem buscarPersonagem(int id) {
        return this.personagens.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Personagem> listarPersonagens() { return new ArrayList<>(this.personagens); }

    public boolean removerPersonagem(int id) { return this.personagens.removeIf(p -> p.getId() == id); }

    public int getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}