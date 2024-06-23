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
        return "Cura: " + cura;
    }

    
    

}
