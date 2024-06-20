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

    @Override
    public String toString() {
        return super.toString() + ", raca=" + raca;
    }

    public void fromString(String linha){
        String[] partes = linha.split(", ");

        setNome(partes[0].split("=")[1]);
        setClasse(partes[1].split("=")[1]);
        setNivel(Integer.parseInt(partes[2].split("=")[1]));
        setPontosVida(Integer.parseInt(partes[3].split("=")[1]));
        setForca(Integer.parseInt(partes[4].split("=")[1]));
        setRaca(partes[5].split("=")[1]);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nRaça:" + raca;
    }
  
}
