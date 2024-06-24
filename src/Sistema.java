import java.util.ArrayList;

public class Sistema {

//----------------------------------------------------------------------------MENU-PRINCIPAL------------------------------------------
    
    private static void exibirMenu(){

        System.out.println("\nSimulador combate");
        System.out.println("1) Cadastrar personagem");
        System.out.println("2) Editar personagem");
        System.out.println("3) Lista de personagens");
        System.out.println("4) Combate");
        System.out.println("5) Deletar personagem");
        System.out.println("0) Sair");

    }

//------------------------------------------------------MENU-DE-CADASTRO-DOS-PERSONAGENS-E-SEUS-MÉTODOS-----------------------------------

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

//----------------------------------------------------------MENU-EDIÇÃO-DE-PERSONAGENS-E-SEUS-MÉTODOS---------------------------------------------------------------------------

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

    private static void editarNomeGuerreiro(Guerreiro busca){

        try {  
                       
            String nome = Console.lerString("\nInforme o novo nome: ");
                                    
            busca.setNome(nome);
                        
            Db.salvarGuerreiroNoArquivo();
            
            System.out.println("\nGuerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarNivelGuerreiro(Guerreiro busca){

        try {  
                       
            int nivel = Console.lerInt("\nInforme o novo nivel: ");
                                    
            busca.setNivel(nivel);
                        
            Db.salvarGuerreiroNoArquivo();
            
            System.out.println("\nGuerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarPontosVidaGuerreiro(Guerreiro busca){

        try {  
                       
            int pontosVida = Console.lerInt("\nInforme os novos pontos de vida: ");
                                    
            busca.setPontosVida(pontosVida);
                        
            Db.salvarGuerreiroNoArquivo();
            
            System.out.println("\nGuerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void editarForcaGuerreiro(Guerreiro busca){

        try {  
                       
            int atributoAtaque = Console.lerInt("\nInforme o novo atributo de ataque: ");
                                    
            busca.setForca(atributoAtaque);
                        
            Db.salvarGuerreiroNoArquivo();
            
            System.out.println("\nGuerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    } 

    private static void editarBonusVidaGuerreiro(Guerreiro busca){

        try {  
                       
            int bonusVida = Console.lerInt("\nInforme o novo bônus de vida: ");
                                    
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
    
//----------------------------------------------------------MENU-LISTAR-PERSONAGENS-E-SEUS-MÉTODOS--------------------------------------------

    private static void menuListarPersonagem(){

        System.out.println("\nMenu Listar");
        System.out.println("1) Listar Guerreiro");
        System.out.println("2) Listar Mago");
        System.out.println("3) Listar Suporte");
        System.out.println("4) Listar Vilão");
        System.out.println("5) Listar Todos");
        System.out.println("0) Voltar");

    }

    private static void menuListarGuerreiro(){

        System.out.println("\nMenu lista Guerreiro");
        System.out.println("1) Listar guerreiro específico");
        System.out.println("2) Listar todos os Guerreiros");
        System.out.println("0) Voltar");

    }

    private static void menuListarMago(){

        System.out.println("\nMenu lista Mago");
        System.out.println("1) Listar mago específico");
        System.out.println("2) Listar todos os magos");
        System.out.println("0) Voltar");

    }

    private static void menuListarSuporte(){

        System.out.println("\nMenu lista Suporte");
        System.out.println("1) Listar suporte específico");
        System.out.println("2) Listar todos os suportes");
        System.out.println("0) Voltar");

    }

    private static void menuListarVilao(){

        System.out.println("\nMenu lista Vilão");
        System.out.println("1) Listar vilão específico");
        System.out.println("2) Listar todos os Vilões");
        System.out.println("0) Voltar");

    }

    private static void listarGuerreiro(){

        try {
            
            GerenciadorPersonagem.verificarListaGuerreiroVazia();
            String nome = Console.lerString("Informe o nome do guerreiro: ");
            Guerreiro busca = GerenciadorPersonagem.buscarGuerreiro(nome);
            System.out.println("Guerreiro localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());  
        }

    }

    private static void listarMago(){

        try {
            
            GerenciadorPersonagem.verificarListaMagoVazia();
            String nome = Console.lerString("Informe o nome do Mago: ");
            Mago busca = GerenciadorPersonagem.buscarMago(nome);
            System.out.println("Mago localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarSuporte(){

        try {
            
            GerenciadorPersonagem.verificarListaSuporteVazia();
            String nome = Console.lerString("Informe o nome do Suporte: ");
            Suporte busca = GerenciadorPersonagem.buscarSuporte(nome);
            System.out.println("Suporte localizado: " + busca.exibirDados());
            
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarVilao(){

        try {
            
            GerenciadorPersonagem.verificarListaVilaoVazia();
            String nome = Console.lerString("Informe o nome do Vilão: ");
            Vilao busca = GerenciadorPersonagem.buscarVilao(nome);
            System.out.println("Vilão localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosGuerreiros(){

        ArrayList<Guerreiro> listaGuerreiros = GerenciadorPersonagem.getListaGuerreiro();

        try {
            GerenciadorPersonagem.verificarListaGuerreiroVazia();
            
            System.out.println("\nGuerreiros cadastrados:");
            for (Guerreiro tempGuerreiro : listaGuerreiros) {
    
                System.out.println(tempGuerreiro.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosMagos(){

        ArrayList<Mago> listaMagos = GerenciadorPersonagem.getListaMago();

        try {
            GerenciadorPersonagem.verificarListaMagoVazia();
            
            System.out.println("\nMagos cadastrados:");
            for (Mago tempMago : listaMagos) {
    
                System.out.println(tempMago.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosSuportes(){

        ArrayList<Suporte> listaSuportes = GerenciadorPersonagem.getListaSuporte();

        try {
            GerenciadorPersonagem.verificarListaSuporteVazia();
            
            System.out.println("\nSuportes cadastrados:");
            for (Suporte tempSuporte : listaSuportes) {
    
                System.out.println(tempSuporte.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosViloes(){

        ArrayList<Vilao> listaViloes = GerenciadorPersonagem.getListaVilao();

        try {
            GerenciadorPersonagem.verificarListaVilaoVazia();
            
            System.out.println("\nVilões cadastrados:");
            for (Vilao tempVilao : listaViloes) {
    
                System.out.println(tempVilao.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

//------------------------------------------------------------------MENU-EXCLUIR-PERSONAGENS---------------------------------------------------------------------------------------

    private static void menuExcluirPersonagem(){

        System.out.println("\nMenu Excluir");
        System.out.println("1) Guerreiro");
        System.out.println("2) Mago");
        System.out.println("3) Suporte");
        System.out.println("4) Vilão");
        System.out.println("0) Voltar");

    }

    private static void excluirGuerreiro(Guerreiro busca){

        try {  
            
            GerenciadorPersonagem.removerGuerreiro(busca);

            Db.salvarSuporteNoArquivo();
            
            System.out.println("\nGuerreiro " + busca.getNome() + " excluído com sucesso!");
          

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirMago(Mago busca){

        try {  
            
            GerenciadorPersonagem.removerMago(busca);

            Db.salvarSuporteNoArquivo();
            
            System.out.println("\nMago " + busca.getNome() + " excluído com sucesso!");
          

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirSuporte(Suporte busca){

        try {  
            
            GerenciadorPersonagem.removerSuporte(busca);

            Db.salvarSuporteNoArquivo();
            
            System.out.println("\nSuporte " + busca.getNome() + " excluído com sucesso!");
          

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirVilao(Vilao busca){

        try {  
            
            GerenciadorPersonagem.removerVilao(busca);

            Db.salvarSuporteNoArquivo();
            
            System.out.println("\nVilao " + busca.getNome() + " excluído com sucesso!");
          

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}

