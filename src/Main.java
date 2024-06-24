public class Main {
    public static void main(String[] args) {

        try {
            Db.criarArquivoSeNaoExistir();
            Db.lerGuerreiroDoArquivo();
            Db.lerMagoDoArquivo();
            Db.lerSuporteDoArquivo();
            Db.lerVilaoDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        
    }
}


