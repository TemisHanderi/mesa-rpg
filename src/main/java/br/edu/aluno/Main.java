package br.edu.aluno;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Mestre mestre = new Mestre(1, "Gandalf");


        Mesa mesa = new Mesa(1, "Aventura Épica");

        Jogador jogador1 = new Jogador(1, "Temis");
        Jogador jogador2 = new Jogador(2, "Davi");

        mesa.adicionarJogador(jogador1);
        mesa.adicionarJogador(jogador2);


        Guerreiro guerreiro = new Guerreiro(
                1,
                "Thorin",
                10,
                120,
                20
        );

        Mago mago = new Mago(
                2,
                "Merlin",
                12,
                80,
                25
        );

        Arqueiro arqueiro = new Arqueiro(
                3,
                "Legolas",
                11,
                90,
                30
        );


        arqueiro.definirMentor(guerreiro);


        Item espada = new Item(
                1,
                "Espada Longa",
                "Arma"
        );

        Item cajado = new Item(
                2,
                "Cajado Arcano",
                "Arma"
        );

        Item arco = new Item(
                3,
                "Arco Élfico",
                "Arma"
        );

        guerreiro.adicionarItem(espada);
        mago.adicionarItem(cajado);
        arqueiro.adicionarItem(arco);


        jogador1.adicionarPersonagem(guerreiro);
        jogador1.adicionarPersonagem(arqueiro);

        jogador2.adicionarPersonagem(mago);


        Participacao p1 = new Participacao(
                "Tank",
                new Date(),
                jogador1,
                guerreiro
        );

        Participacao p2 = new Participacao(
                "DPS",
                new Date(),
                jogador1,
                arqueiro
        );

        Participacao p3 = new Participacao(
                "Mago",
                new Date(),
                jogador2,
                mago
        );

        mesa.adicionarParticipacao(p1);
        mesa.adicionarParticipacao(p2);
        mesa.adicionarParticipacao(p3);


        Sessao sessao = mesa.criarSessao(
                1,
                new Date(),
                "Os heróis chegam a uma antiga masmorra."
        );


        System.out.println("===== MESA DE RPG =====");
        System.out.println("Mesa: " + mesa.getNome());

        System.out.println("\n===== MESTRE =====");
        System.out.println(
                mestre.narrar(
                        "Uma névoa misteriosa cobre o vale."
                )
        );

        System.out.println("\n===== JOGADORES =====");
        for (Jogador jogador : mesa.listarJogadores()) {
            System.out.println("Jogador: " + jogador.getNome());

            for (Personagem personagem : jogador.listarPersonagens()) {
                System.out.println(
                        "  Personagem: " + personagem.getNome()
                );
            }
        }

        System.out.println("\n===== ATAQUES =====");
        System.out.println(guerreiro.atacar());
        System.out.println(mago.atacar());
        System.out.println(arqueiro.atacar());

        System.out.println("\n===== MENTOR =====");
        System.out.println(
                arqueiro.getNome()
                        + " tem como mentor "
                        + arqueiro.getMentor().getNome()
        );

        System.out.println("\n===== PARTICIPAÇÕES =====");
        for (Participacao participacao : mesa.listarParticipacoes()) {

            System.out.println(
                    participacao.getJogador().getNome()
                            + " participa como "
                            + participacao.getPersonagem().getNome()
                            + " (" + participacao.getPapel() + ")"
            );
        }

        System.out.println("\n===== SESSÕES =====");
        System.out.println(
                "Quantidade de sessões: "
                        + mesa.listarSessao().size()
        );
    }
}