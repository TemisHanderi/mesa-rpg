package br.edu.aluno;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    private int id;
    private String nome;
    private int nivel;
    private int vida;
    private Personagem mentor;
    private final List<Item> itens;

    public Personagem(int id, String nome, int nivel, int vida) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.itens = new ArrayList<>();
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) { this.vida = 0; }
    }

    public void curar(int valor) { this.vida += valor; }

    public void adicionarItem(Item item) { this.itens.add(item); }

    public boolean removerItem(int id) { return this.itens.removeIf(item -> item.getId() == id); }

    public List<Item> listarItens() { return new ArrayList<>(this.itens); }

    public void definirMentor(Personagem mentor) { this.mentor = mentor; }

    public Personagem getMentor() { return this.mentor; }

    public abstract String atacar();

    public int getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getNivel() { return nivel; }

    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getVida() { return vida; }
}