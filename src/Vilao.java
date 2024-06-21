public class Vilao extends Personagem{

    private int poderDoMal;

    public Vilao() {
        
    }
    
    public Vilao(String nome, String classe, int nivel, int pontosVida, int forca, int poderDoMal) {
        super(nome, classe, nivel, pontosVida, forca);
        this.poderDoMal = poderDoMal;
    }
    
    public int getPoderDoMal() {
        return poderDoMal;
    }

    public void setPoderDoMal(int poderDoMal) {
        this.poderDoMal = poderDoMal;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", poderDoMal=" + poderDoMal;
    }

    public void fromString(String linha){
        String[] partes = linha.split(", ");

        setNome(partes[0].split("=")[1]);
        setClasse(partes[1].split("=")[1]);
        setNivel(Integer.parseInt(partes[2].split("=")[1]));
        setPontosVida(Integer.parseInt(partes[3].split("=")[1]));
        setForca(Integer.parseInt(partes[4].split("=")[1]));
        setPoderDoMal(Integer.parseInt(partes[5].split("=")[1]));
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nPoder do mal:" + poderDoMal;
    }

  
}
