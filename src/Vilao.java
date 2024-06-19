public class Vilao extends Personagem{

    private String raca;

    public Vilao() {

    }

    public Vilao(String nome, String classe, int nivel, int pontosVida, int forca, String raca) {
        super(nome, classe, nivel, pontosVida, forca);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
  
}
