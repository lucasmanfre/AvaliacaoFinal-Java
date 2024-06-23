public class Guerreiro extends Personagem {
    
    private float bonusVida;

    public Guerreiro() {
    }

    public Guerreiro(String nome, String classe, int nivel, int pontosVida, int forca, float bonusVida) {
        super(nome, classe, nivel, pontosVida, forca);
        this.bonusVida = bonusVida;
    }

    public float getBonusVida() {
        return bonusVida;
    }

    public void setBonusVida(float bonusVida) {
        this.bonusVida = bonusVida;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nBonus de vida:" + bonusVida;
    }




}
