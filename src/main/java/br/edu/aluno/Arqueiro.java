package br.edu.aluno;

public class Arqueiro extends Personagem implements Atacante {
    private int precisao;

    public Arqueiro(int id, String nome, int nivel, int vida, int precisao) {
        super(id, nome, nivel, vida);
        this.precisao = precisao;
    }

    @Override
    public String atacar() {
        int dano = this.precisao * 2;
        return this.getNome() + " disparou uma flecha causando " + dano + " de dano!";
    }

    public int getPrecisao() { return precisao; }

    public void setPrecisao(int precisao) { this.precisao = precisao; }
}