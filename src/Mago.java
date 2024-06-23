public class Mago extends Personagem {
    
    private int bonusAtaque;

    public Mago() {
    }

    public Mago(String nome, String classe, int nivel, int pontosVida, int forca, int bonusAtaque) {
        super(nome, classe, nivel, pontosVida, forca);
        this.bonusAtaque = bonusAtaque;
    }

    public int getBonusAtaque() {
        return bonusAtaque;
    }

    public void setBonusAtaque(int bonusAtaque) {
        this.bonusAtaque = bonusAtaque;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonusAtaque=" + bonusAtaque;
    }

    public void fromString(String linha){
        String[] partes = linha.split(", ");

        setNome(partes[0].split("=")[1]);
        setClasse(partes[1].split("=")[1]);
        setNivel(Integer.parseInt(partes[2].split("=")[1]));
        setPontosVida(Integer.parseInt(partes[3].split("=")[1]));
        setForca(Integer.parseInt(partes[4].split("=")[1]));
        setBonusAtaque(Integer.parseInt(partes[5].split("=")[1]));
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nBonus de ataque:" + bonusAtaque;
    }

    

    

}