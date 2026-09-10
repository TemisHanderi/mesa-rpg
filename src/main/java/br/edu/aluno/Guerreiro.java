package br.edu.aluno;

public class Guerreiro extends Personagem implements Atacante {
    private int forca;

    public Guerreiro(int id, String nome, int nivel, int vida, int forca) {
        super(id, nome, nivel, vida);
        this.forca = forca;
    }

    @Override
    public String atacar() {
        int dano = this.forca * 2;
        return this.getNome() + " golpeou com a espada causando " + dano + " de dano!";
    }

    public int getForca() { return forca; }

    public void setForca(int forca) { this.forca = forca; }
}