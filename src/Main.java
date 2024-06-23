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

        //---------------------------------------------------------

        String nome = Console.lerString("Informe o nome do guerreiro: ");
        
        Guerreiro g1 = new Guerreiro(nome, "Guerreiro", 1, 100, 40, 10);
        CadastroPersonagem.cadastrarGuerreiro(g1);

        try {

            Db.salvarGuerreiroNoArquivo();
            System.out.println("\nGuerreiro salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
        
        //---------------------------------------------------------

        String nome2 = Console.lerString("Informe o nome do mago: ");
        
        Mago m1 = new Mago(nome2, "Mago", 1, 100, 40, 10);
        CadastroPersonagem.cadastrarMago(m1);

        try {

            Db.salvarMagoNoArquivo();
            System.out.println("\nMago salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        //---------------------------------------------------------
        
        String nome3 = Console.lerString("Informe o nome do suporte: ");
        
        Suporte s1 = new Suporte(nome3, "Suporte", 1, 100, 40, 10);
        CadastroPersonagem.cadastrarSuporte(s1);

        try {

            Db.salvarSuporteNoArquivo();
            System.out.println("\nSuporte salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        //---------------------------------------------------------
        
        String nome4 = Console.lerString("Informe o nome do vilao: ");
        
        Vilao v1 = new Vilao(nome4, "Vilao", 1, 100, 40, 60);
        CadastroPersonagem.cadastrarVilao(v1);

        try {

            Db.salvarVilaoNoArquivo();
            System.out.println("\nVilao salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        //---------------------------------------------------------



    }
}
