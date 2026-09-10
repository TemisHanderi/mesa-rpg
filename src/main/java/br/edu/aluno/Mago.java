package br.edu.aluno;

public class Mago extends Personagem implements Atacante {
    private int inteligencia;

    public Mago(int id, String nome, int nivel, int vida, int inteligencia) {
        super(id, nome, nivel, vida);
        this.inteligencia = inteligencia;
    }

    @Override
    public String atacar() {
        int dano = this.inteligencia * 3;
        return this.getNome() + " conjurou uma bola de fogo causando " + dano + " de dano!";
    }

    public int getInteligencia() { return inteligencia; }

    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }
}