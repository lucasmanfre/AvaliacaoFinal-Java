package Personagens;

public class Guerreiro extends Personagem {
    
    private int bonusVida;

    public Guerreiro() {
    }

    public Guerreiro(String nome, String classe, int nivel, int pontosVida, int forca, int bonusVida) {
        super(nome, classe, nivel, pontosVida, forca);
        this.bonusVida = bonusVida;
    }

    public int getBonusVida() {
        return bonusVida;
    }

    public void setBonusVida(int bonusVida) {
        this.bonusVida = bonusVida;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", bonusVida=" + bonusVida;
    }

    public void fromString(String linha){
        String[] partes = linha.split(", ");

        setNome(partes[0].split("=")[1]);
        setClasse(partes[1].split("=")[1]);
        setNivel(Integer.parseInt(partes[2].split("=")[1]));
        setPontosVida(Integer.parseInt(partes[3].split("=")[1]));
        setForca(Integer.parseInt(partes[4].split("=")[1]));
        setBonusVida(Integer.parseInt(partes[5].split("=")[1]));
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nBonus de vida:" + bonusVida;
    }




}
