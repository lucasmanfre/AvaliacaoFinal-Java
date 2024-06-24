public class Sistema {
    
    private static void exibirMenu(){

        System.out.println("\nSimulador combate");
        System.out.println("1) Cadastrar personagem");
        System.out.println("2) Editar personagem");
        System.out.println("3) Lista de personagens");
        System.out.println("4) Combate");
        System.out.println("5) Deletar personagem");
        System.out.println("0) Sair");

    }

    //----------------MENU-DE-CADASTRO-DOS-PERSONAGENS---------------------------------------

    private static void menuCadastroPersonagem(){

        System.out.println("\nMenu de Criação");
        System.out.println("Criar Guerreiro");
        System.out.println("Criar Mago");
        System.out.println("Criar Suporte");
        System.out.println("Criar Vilão");

    }

    public static void cadastrarGuerreiro(){
        System.out.println("\nNovo Guerreiro");
        String nomeGuerreiro = Console.lerString("Nome do Guerreiro: ");
        int nivelGuerreiro = Console.lerInt("Nível do Guerreiro: ");
        int pontosVidaGuerreiro = Console.lerInt("Pontos de vida do Guerreiro: ");
        int atributoAtaqueGuerreiro = Console.lerInt("Pontos de força do Guerreiro: ");
        int bonusVida = Console.lerInt("Quantidade de vida bônus: ");

        Guerreiro novoGuerreiro = new Guerreiro(nomeGuerreiro, "Guerreiro", nivelGuerreiro, pontosVidaGuerreiro, atributoAtaqueGuerreiro, bonusVida);
        CadastroPersonagem.cadastrarGuerreiro(novoGuerreiro);

        try {

            Db.salvarGuerreiroNoArquivo();
            System.out.println("\nGuerreiro salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastrarMago(){
        System.out.println("\nNovo Mago");
        String nomeMago = Console.lerString("Nome do Mago: ");
        int nivelMago = Console.lerInt("Nível do Mago: ");
        int pontosVidaMago = Console.lerInt("Pontos de vida do Mago: ");
        int atributoAtaqueMago = Console.lerInt("Pontos de poder do Mago: ");
        int ataqueBonus = Console.lerInt("Quantidade de ataque bônus: ");

        Mago novoMago = new Mago(nomeMago, "Mago", nivelMago, pontosVidaMago, atributoAtaqueMago, ataqueBonus);
        CadastroPersonagem.cadastrarMago(novoMago);

        try {

            Db.salvarMagoNoArquivo();
            System.out.println("\nMago salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastrarSuporte(){
        System.out.println("\nNovo Suporte");
        String nomeSuporte = Console.lerString("Nome do Suporte: ");
        int nivelSuporte = Console.lerInt("Nível do Suporte: ");
        int pontosVidaSuporte = Console.lerInt("Pontos de vida do Suporte: ");
        int atributoAtaqueSuporte = Console.lerInt("Pontos de poder do Suporte: ");
        int curaBonus = Console.lerInt("Quantidade de cura bônus: ");

        Suporte novoSuporte = new Suporte(nomeSuporte, "Suporte", nivelSuporte, pontosVidaSuporte, atributoAtaqueSuporte, curaBonus);
        CadastroPersonagem.cadastrarSuporte(novoSuporte);

        try {

            Db.salvarSuporteNoArquivo();
            System.out.println("\nSuporte salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastroVilao(){
        System.out.println("\nNovo Vilão");
        String nomeVilao = Console.lerString("Nome do Vilão: ");
        int nivelVilao = Console.lerInt("Nível do Vilão: ");
        int pontosVidaVilao = Console.lerInt("Pontos de vida do Vilão: ");
        int atributoAtaqueVilao = Console.lerInt("Pontos de poder do Vilão: ");
        int poderDoMal = Console.lerInt("Quantidade de poder do mal: ");

        Vilao novoVilao = new Vilao(nomeVilao, "Vilao", nivelVilao, pontosVidaVilao, atributoAtaqueVilao, poderDoMal);
        CadastroPersonagem.cadastrarVilao(novoVilao);

        try {

            Db.salvarVilaoNoArquivo();
            System.out.println("\nVilao salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    //--------------------------------------------------------------------------------------------------------



}
