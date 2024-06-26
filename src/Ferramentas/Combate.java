package Ferramentas;

import Personagens.*;

import java.util.Random;

public class Combate {

    private Personagem personagem;
    private Vilao vilao;
    private Random random;

    public Combate(Personagem personagem, Vilao vilao){
        this.personagem = personagem;
        this.vilao = vilao;
        this.random = new Random();
    }

    public void iniciarCombate() {
        if (personagem instanceof Guerreiro){
            personagem.setPontosVida(personagem.getPontosVida() + ((Guerreiro) personagem).getBonusVida());
            System.out.println(personagem.getNome() + " está enfurecido!");
            System.out.println("recebeu " + ((Guerreiro) personagem).getBonusVida() + " pontos de vida...");
        }

        while (personagem.getPontosVida() > 0 && vilao.getPontosVida() > 0) {
            realizarAtaque(personagem, vilao);
            if (vilao.getPontosVida() > 0) {
                realizarAtaque(vilao, personagem);
            }
        }

        if (personagem.getPontosVida() <= 0) {
            System.out.println(vilao.getNome() + " Ganhou!!!");
        } else {
            System.out.println(personagem.getNome() + " Ganhou!!!");
        }
    }

    private void realizarAtaque(Personagem atacante, Personagem defensor) {
        int dano = atacante.getForca();
        if (random.nextInt(2) == 0) {
            dano += aplicarHabilidadeEspecial(atacante);
        }
        defensor.setPontosVida(defensor.getPontosVida() - dano);
        System.out.println(atacante.getNome() + " atacou " + defensor.getNome() + " causando " + dano + " de dano. Pontos de vida de " + defensor.getNome() + ": " + defensor.getPontosVida());
    }

    private int aplicarHabilidadeEspecial(Personagem personagem) {
 
        if (personagem instanceof Mago) {
            int bonusAtaque = ((Mago) personagem).getBonusAtaque();
            System.out.println(personagem.getNome() + " ativou sua habilidade especial: Bola de Fogo!");
            return bonusAtaque;
        } else if (personagem instanceof Suporte) {
            int cura = ((Suporte) personagem).getCura();
            System.out.println(personagem.getNome() + " ativou sua habilidade especial: Cura!");
            personagem.setPontosVida(personagem.getPontosVida() + cura); 
            return 0;
        } else if (personagem instanceof Vilao){
            int poderDoMal = ((Vilao) personagem).getPoderDoMal();
            System.out.println(personagem.getNome() + " ativou sua habilidade especial: Maldição!");
            return poderDoMal;
        }
        
        return 0;
    }
}
