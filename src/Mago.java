public class Mago extends Personagem {
    
    private float bonusAtaque;

    public Mago() {
    }

    public Mago(String nome, String classe, int nivel, int pontosVida, int forca, float bonusAtaque) {
        super(nome, classe, nivel, pontosVida, forca);
        this.bonusAtaque = bonusAtaque;
    }

    public float getBonusAtaque() {
        return bonusAtaque;
    }

    public void setBonusAtaque(float bonusAtaque) {
        this.bonusAtaque = bonusAtaque;
    }

    @Override
    public String toString() {
        return "Bonus de ataque: " + bonusAtaque;
    }

    

    

}
