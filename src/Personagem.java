public abstract class Personagem {
    
    private String nome;
    private String classe;
    private int nivel;
    private int pontosVida;
    private int forca;

    public Personagem(){
    }

    public Personagem(String nome, String classe, int nivel, int pontosVida, int forca) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosVida = pontosVida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    
    @Override
    public String toString() {
        return "\nNome: " + nome +
        "\nClasse: " + classe + 
        "\nNivel: " + nivel +
        "\nPontos de vida: " + pontosVida +
        "\nForça: " + forca;
    }


}
