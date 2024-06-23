public class Suporte extends Personagem{
    
    private int cura;

    public Suporte() {
    }

    public Suporte(String nome, String classe, int nivel, int pontosVida, int forca, int cura) {
        super(nome, classe, nivel, pontosVida, forca);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    @Override
    public String toString() {
        return super.toString() + ", cura=" + cura;
    }

    public void fromString(String linha){
        String[] partes = linha.split(", ");

        setNome(partes[0].split("=")[1]);
        setClasse(partes[1].split("=")[1]);
        setNivel(Integer.parseInt(partes[2].split("=")[1]));
        setPontosVida(Integer.parseInt(partes[3].split("=")[1]));
        setForca(Integer.parseInt(partes[4].split("=")[1]));
        setCura(Integer.parseInt(partes[5].split("=")[1]));
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nCura:" + cura;
    }

    
    

}
