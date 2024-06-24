public class Sistema {

    //-------------------------------------------------MENU-PRINCIPAL------------------------------------------
    
    private static void exibirMenu(){

        System.out.println("\nSimulador combate");
        System.out.println("1) Cadastrar personagem");
        System.out.println("2) Editar personagem");
        System.out.println("3) Lista de personagens");
        System.out.println("4) Combate");
        System.out.println("5) Deletar personagem");
        System.out.println("0) Sair");

    }

    //----------------------------------MENU-DE-CADASTRO-DOS-PERSONAGENS-E-SEUS-MÉTODOS-----------------------------------

    private static void menuCadastroPersonagem(){

        System.out.println("\nMenu de Criação");
        System.out.println("1) Criar Guerreiro");
        System.out.println("2) Criar Mago");
        System.out.println("3) Criar Suporte");
        System.out.println("4) Criar Vilão");
        System.out.println("0) Sair");

    }

    private static void cadastrarGuerreiro(){

        System.out.println("\nNovo Guerreiro");
        String nomeGuerreiro = Console.lerString("Nome do Guerreiro: ");
        int nivelGuerreiro = Console.lerInt("Nível do Guerreiro: ");
        int pontosVidaGuerreiro = Console.lerInt("Pontos de vida do Guerreiro: ");
        int atributoAtaqueGuerreiro = Console.lerInt("Pontos de força do Guerreiro: ");
        int bonusVida = Console.lerInt("Quantidade de vida bônus: ");

        Guerreiro novoGuerreiro = new Guerreiro(nomeGuerreiro, "Guerreiro", nivelGuerreiro, pontosVidaGuerreiro, atributoAtaqueGuerreiro, bonusVida);
        GerenciadorPersonagem.cadastrarGuerreiro(novoGuerreiro);

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
        GerenciadorPersonagem.cadastrarMago(novoMago);

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
        GerenciadorPersonagem.cadastrarSuporte(novoSuporte);

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
        GerenciadorPersonagem.cadastrarVilao(novoVilao);

        try {

            Db.salvarVilaoNoArquivo();
            System.out.println("\nVilao salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    //--------------------------------------MENU-EDIÇÃO-DE-PERSONAGENS-E-SEUS-MÉTODOS---------------------------------------------------------------------------

    private static void menuEditarPersonagem(){

        System.out.println("\nMenu de Edição do Personagem");
        System.out.println("1) Editar Guerreiro");
        System.out.println("2) Editar Mago");
        System.out.println("3) Editar Suporte");
        System.out.println("4) Editar Vilão");
        System.out.println("0) Voltar");

    }

    private static void menuEditarGuerreiro(){

        System.out.println("\nMenu de Edição do Guerreiro");
        System.out.println("1) Editar o nome");
        System.out.println("2) Editar o nível");
        System.out.println("3) Editar pontos de vida");
        System.out.println("4) Editar o atributo de ataque");
        System.out.println("5) Editar a vida bônus");
        System.out.println("6) Editar todos");
        System.out.println("0) Voltar");

    }

    private static void menuEditarMago(){

        System.out.println("\nMenu de Edição do Mago");
        System.out.println("1) Editar o nome");
        System.out.println("2) Editar o nível");
        System.out.println("3) Editar pontos de vida");
        System.out.println("4) Editar o atributo de ataque");
        System.out.println("5) Editar o ataque bônus");
        System.out.println("6) Editar todos");
        System.out.println("0) Voltar");

    }

    private static void menuEditarSuporte(){

        System.out.println("\nMenu de Edição do Suporte");
        System.out.println("1) Editar o nome");
        System.out.println("2) Editar o nível");
        System.out.println("3) Editar pontos de vida");
        System.out.println("4) Editar o atributo de ataque");
        System.out.println("5) Editar a cura bônus");
        System.out.println("6) Editar todos");
        System.out.println("0) Voltar");

    }

    private static void menuEditarVilao(){

        System.out.println("\nMenu de Edição do Vilao");
        System.out.println("1) Editar o nome");
        System.out.println("2) Editar o nível");
        System.out.println("3) Editar pontos de vida");
        System.out.println("4) Editar o atributo de ataque");
        System.out.println("5) Editar o atributo poder do mal");
        System.out.println("6) Editar todos");
        System.out.println("0) Voltar");

    }

    private static void editarGuerreiro(Guerreiro busca){
       
        try {  
            
            System.out.println("\nInforme os novos dados:");
            
            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida= Console.lerInt("Quantidade de vida: ");
            int atributoAtaque= Console.lerInt("Atributo de Ataque: ");
            int bonusVida= Console.lerInt("Bônus de Vida: ");
                        
            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setBonusVida(bonusVida);
            
            Db.salvarGuerreiroNoArquivo();
            
            System.out.println("\nGuerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarMago(Mago busca){
       
        try {  
            
            System.out.println("\nInforme os novos dados:");
            
            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida= Console.lerInt("Quantidade de vida: ");
            int atributoAtaque= Console.lerInt("Atributo de Ataque: ");
            int bonusAtaque= Console.lerInt("Bônus de Ataque: ");
                        
            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setBonusAtaque(bonusAtaque);
            
            Db.salvarMagoNoArquivo();
            
            System.out.println("\nMago atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarSuporte(Suporte busca){
       
        try {  
            
            System.out.println("\nInforme os novos dados:");
            
            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida= Console.lerInt("Quantidade de vida: ");
            int atributoAtaque= Console.lerInt("Atributo de Ataque: ");
            int bonusCura= Console.lerInt("Bônus de Cura: ");
                        
            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setCura(bonusCura);
            
            Db.salvarSuporteNoArquivo();
            
            System.out.println("\nSuporte atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarVilao(Vilao busca){
               
        try {  
            
            System.out.println("\nInforme os novos dados:");
            
            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida= Console.lerInt("Quantidade de vida: ");
            int atributoAtaque= Console.lerInt("Atributo de Ataque: ");
            int poderDoMal= Console.lerInt("Atributo de poder do mal: ");
                        
            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setPoderDoMal(poderDoMal);
            
            Db.salvarVilaoNoArquivo();
            
            System.out.println("\nVilao atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    //-------------------------------MENU-BUSCAR-PERSONAGENS-E-SEUS-MÉTODOS--------------------------------------------

    private static void menuBuscarPersonagem(){

        System.out.println("\nMenu Buscar");
        System.out.println("1)Buscar Guerreiro");
        System.out.println("2)Buscar Mago");
        System.out.println("3)Buscar Suporte");
        System.out.println("4)Buscar Vilão");
        System.out.println("0) Voltar");

    }
    
    private static Guerreiro buscarGuerreiro(){

        try {
            
            GerenciadorPersonagem.verificarListaGuerreiroVazia();
            String nome = Console.lerString("Informe o nome do guerreiro: ");
            Guerreiro busca = GerenciadorPersonagem.buscarGuerreiro(nome);
            return busca;
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        
    }

    private static Mago buscarMago(){

        try {
            
            GerenciadorPersonagem.verificarListaMagoVazia();
            String nome = Console.lerString("Informe o nome do Mago: ");
            Mago busca = GerenciadorPersonagem.buscarMago(nome);
            return busca;
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        
    }

    private static Suporte buscarSuporte(){

        try {
            
            GerenciadorPersonagem.verificarListaSuporteVazia();
            String nome = Console.lerString("Informe o nome do Suporte: ");
            Suporte busca = GerenciadorPersonagem.buscarSuporte(nome);
            return busca;
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        
    }

    private static Vilao buscarVilao(){

        try {
            
            GerenciadorPersonagem.verificarListaVilaoVazia();
            String nome = Console.lerString("Informe o nome do Vilao: ");
            Vilao busca = GerenciadorPersonagem.buscarVilao(nome);
            return busca;
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        
    }



}
