package Ferramentas;

import Personagens.*;

import java.util.ArrayList;

public class Sistema {

//----------------------------------------------------------------------------MENU-PRINCIPAL------------------------------------------

    private static void exibirMenu() {

        System.out.println("\nArena do Gui");
        System.out.println("1) Cadastrar personagem");
        System.out.println("2) Editar personagem");
        System.out.println("3) Lista de personagens");
        System.out.println("4) Combate");
        System.out.println("5) Deletar personagem");
        System.out.println("0) Sair");

    }

    private static void menuPrincipal() throws Exception {
        int op = Console.lerInt("Informe uma opção:");
        int opMenu;
//        CadastroPersonagem.verificarListaPersonagemVazia();
        switch (op) {
            case 1:
                menuCadastroPersonagem();
                opMenu = Console.lerInt("Informe uma opção:");
                switchCadastroPersonagem(opMenu);
                break;
            case 2:
                menuEditarPersonagem();
                opMenu = Console.lerInt("Informe uma opção:");
                switchEditarPersonagem(opMenu);
                break;
            case 3:
                menuListarPersonagem();
                opMenu = Console.lerInt("Infome uma opção:");
                switchListarPersonagem(opMenu);
                break;
            case 4:
                iniciarCombateMenu();
                break;
            case 5:
                menuExcluirPersonagem();
                opMenu = Console.lerInt("Informe uma opção:");
                switchDeletarPersonagem(opMenu);
                break;
            case 0:
                System.out.println("Saindo do sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida...");
                System.out.println("Tente novamente");
                break;
        }
    }

//------------------------------------------------------MENU-DE-CADASTRO-DOS-PERSONAGENS-E-SEUS-MÉTODOS-----------------------------------

    private static void switchCadastroPersonagem(int opCadastro) throws Exception {
        switch (opCadastro) {
            case 1: cadastrarGuerreiro();
                break;
            case 2: cadastrarMago();
                break;
            case 3: cadastrarSuporte();
                break;
            case 4: cadastroVilao();
                break;
            case 0:
                System.out.println("Voltando ao menu...");
                return;
            default:
                System.out.println("Opção invalida...");
                System.out.println("Tente novamente");
                break;
        }
    }

    private static void menuCadastroPersonagem() {

        System.out.println("\nMenu de Criação");
        System.out.println("1) Criar Personagens.Guerreiro");
        System.out.println("2) Criar Personagens.Mago");
        System.out.println("3) Criar Personagens.Suporte");
        System.out.println("4) Criar Vilão");
        System.out.println("0) Voltar");

    }

    private static void cadastrarGuerreiro() {

        System.out.println("\nNovo Personagens.Guerreiro");
        String nomeGuerreiro = Console.lerString("Nome do Personagens.Guerreiro: ");
        int nivelGuerreiro = Console.lerInt("Nível do Personagens.Guerreiro: ");
        int pontosVidaGuerreiro = Console.lerInt("Pontos de vida do Personagens.Guerreiro: ");
        int atributoAtaqueGuerreiro = Console.lerInt("Pontos de força do Personagens.Guerreiro: ");
        int bonusVida = Console.lerInt("Quantidade de vida bônus: ");

        Guerreiro novoGuerreiro = new Guerreiro(nomeGuerreiro, "Personagens.Guerreiro", nivelGuerreiro, pontosVidaGuerreiro, atributoAtaqueGuerreiro, bonusVida);
        CadastroPersonagem.cadastrarGuerreiro(novoGuerreiro);

        try {

            Db.salvarGuerreiroNoArquivo();
            System.out.println("\nPersonagens.Guerreiro salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastrarMago() {

        System.out.println("\nNovo Personagens.Mago");
        String nomeMago = Console.lerString("Nome do Personagens.Mago: ");
        int nivelMago = Console.lerInt("Nível do Personagens.Mago: ");
        int pontosVidaMago = Console.lerInt("Pontos de vida do Personagens.Mago: ");
        int atributoAtaqueMago = Console.lerInt("Pontos de poder do Personagens.Mago: ");
        int ataqueBonus = Console.lerInt("Quantidade de ataque bônus: ");

        Mago novoMago = new Mago(nomeMago, "Personagens.Mago", nivelMago, pontosVidaMago, atributoAtaqueMago, ataqueBonus);
        CadastroPersonagem.cadastrarMago(novoMago);

        try {

            Db.salvarMagoNoArquivo();
            System.out.println("\nPersonagens.Mago salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastrarSuporte() {

        System.out.println("\nNovo Personagens.Suporte");
        String nomeSuporte = Console.lerString("Nome do Personagens.Suporte: ");
        int nivelSuporte = Console.lerInt("Nível do Personagens.Suporte: ");
        int pontosVidaSuporte = Console.lerInt("Pontos de vida do Personagens.Suporte: ");
        int atributoAtaqueSuporte = Console.lerInt("Pontos de poder do Personagens.Suporte: ");
        int curaBonus = Console.lerInt("Quantidade de cura bônus: ");

        Suporte novoSuporte = new Suporte(nomeSuporte, "Personagens.Suporte", nivelSuporte, pontosVidaSuporte, atributoAtaqueSuporte, curaBonus);
        CadastroPersonagem.cadastrarSuporte(novoSuporte);

        try {

            Db.salvarSuporteNoArquivo();
            System.out.println("\nPersonagens.Suporte salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void cadastroVilao() {

        System.out.println("\nNovo Vilão");
        String nomeVilao = Console.lerString("Nome do Vilão: ");
        int nivelVilao = Console.lerInt("Nível do Vilão: ");
        int pontosVidaVilao = Console.lerInt("Pontos de vida do Vilão: ");
        int atributoAtaqueVilao = Console.lerInt("Pontos de poder do Vilão: ");
        int poderDoMal = Console.lerInt("Quantidade de poder do mal: ");

        Vilao novoVilao = new Vilao(nomeVilao, "Personagens.Vilao", nivelVilao, pontosVidaVilao, atributoAtaqueVilao, poderDoMal);
        CadastroPersonagem.cadastrarVilao(novoVilao);

        try {

            Db.salvarVilaoNoArquivo();
            System.out.println("\nPersonagens.Vilao salvo com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

//----------------------------------------------------------MENU-EDIÇÃO-DE-PERSONAGENS-E-SEUS-MÉTODOS---------------------------------------------------------------------------

    private static void switchEditarPersonagem(int opEditar) throws Exception {
        switch (opEditar) {
            case 1:
                String nomeG = Console.lerString("Informe o nome do guerreiro que deseja alterar:");
                Guerreiro guerreiro = CadastroPersonagem.buscarGuerreiro(nomeG);
                editarGuerreiro(guerreiro);
                break;
            case 2:
                String nomeM = Console.lerString("Informe o nome do mago que deseja alterar:");
                Mago mago = CadastroPersonagem.buscarMago(nomeM);
                editarMago(mago);
                break;
            case 3:
                String nomeS = Console.lerString("Informe o nome do suporte que deseja alterar:");
                Suporte suporte = CadastroPersonagem.buscarSuporte(nomeS);
                editarSuporte(suporte);
                break;
            case 4:
                String nomeV = Console.lerString("Informe o nome do vilão que deseja alterar:");
                Vilao vilao = CadastroPersonagem.buscarVilao(nomeV);
                editarVilao(vilao);
                break;
            case 0:
                System.out.println("Voltando...");
                return;
            default:
                System.out.println("Opção invalida...");
                System.out.println("Tente novamente");
                break;
        }
    }

    private static void menuEditarPersonagem() {

        System.out.println("\nMENU DE EDIÇÃO DO PERSONAGEM");
        System.out.println("1) Editar Personagens.Guerreiro");
        System.out.println("2) Editar Personagens.Mago");
        System.out.println("3) Editar Personagens.Suporte");
        System.out.println("4) Editar Vilão");
        System.out.println("0) Voltar");

    }

//    private static void menuEditarGuerreiro() {
//
//        System.out.println("\nMENU DE EDIÇÃO DO GUERREIRO");
//        System.out.println("1) Editar o nome");
//        System.out.println("2) Editar o nível");
//        System.out.println("3) Editar pontos de vida");
//        System.out.println("4) Editar o atributo de ataque");
//        System.out.println("5) Editar a vida bônus");
//        System.out.println("6) Editar tudo");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuEditarMago() {
//
//        System.out.println("\nMENU DE EDIÇÃO DO MAGO");
//        System.out.println("1) Editar o nome");
//        System.out.println("2) Editar o nível");
//        System.out.println("3) Editar pontos de vida");
//        System.out.println("4) Editar o atributo de ataque");
//        System.out.println("5) Editar o ataque bônus");
//        System.out.println("6) Editar tudo");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuEditarSuporte() {
//
//        System.out.println("\nMENU DE EDIÇÃO DO SUPORTE");
//        System.out.println("1) Editar o nome");
//        System.out.println("2) Editar o nível");
//        System.out.println("3) Editar pontos de vida");
//        System.out.println("4) Editar o atributo de ataque");
//        System.out.println("5) Editar a cura bônus");
//        System.out.println("6) Editar tudo");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuEditarVilao() {
//
//        System.out.println("\nMENU DE EDIÇÃO DO VILÃO");
//        System.out.println("1) Editar o nome");
//        System.out.println("2) Editar o nível");
//        System.out.println("3) Editar pontos de vida");
//        System.out.println("4) Editar o atributo de ataque");
//        System.out.println("5) Editar o atributo poder do mal");
//        System.out.println("6) Editar tudo");
//        System.out.println("0) Voltar");
//
//    }

    private static void editarGuerreiro(Guerreiro busca) {

        try {

            System.out.println("\nInforme os novos dados:");

            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida = Console.lerInt("Quantidade de vida: ");
            int atributoAtaque = Console.lerInt("Atributo de Ataque: ");
            int bonusVida = Console.lerInt("Bônus de Vida: ");

            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setBonusVida(bonusVida);

            Db.salvarGuerreiroNoArquivo();

            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

//    private static void editarNomeGuerreiro(Guerreiro busca) {
//
//        try {
//
//            String nome = Console.lerString("\nInforme o novo nome: ");
//
//            busca.setNome(nome);
//
//            Db.salvarGuerreiroNoArquivo();
//
//            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarNivelGuerreiro(Guerreiro busca) {
//
//        try {
//
//            int nivel = Console.lerInt("\nInforme o novo nivel: ");
//
//            busca.setNivel(nivel);
//
//            Db.salvarGuerreiroNoArquivo();
//
//            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarPontosVidaGuerreiro(Guerreiro busca) {
//
//        try {
//
//            int pontosVida = Console.lerInt("\nInforme os novos pontos de vida: ");
//
//            busca.setPontosVida(pontosVida);
//
//            Db.salvarGuerreiroNoArquivo();
//
//            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarForcaGuerreiro(Guerreiro busca) {
//
//        try {
//
//            int atributoAtaque = Console.lerInt("\nInforme o novo atributo de ataque: ");
//
//            busca.setForca(atributoAtaque);
//
//            Db.salvarGuerreiroNoArquivo();
//
//            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarBonusVidaGuerreiro(Guerreiro busca) {
//
//        try {
//
//            int bonusVida = Console.lerInt("\nInforme o novo bônus de vida: ");
//
//            busca.setBonusVida(bonusVida);
//
//            Db.salvarGuerreiroNoArquivo();
//
//            System.out.println("\nPersonagens.Guerreiro atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }

    private static void editarMago(Mago busca) {

        try {

            System.out.println("\nInforme os novos dados:");

            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida = Console.lerInt("Quantidade de vida: ");
            int atributoAtaque = Console.lerInt("Atributo de Ataque: ");
            int bonusAtaque = Console.lerInt("Bônus de Ataque: ");

            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setBonusAtaque(bonusAtaque);

            Db.salvarMagoNoArquivo();

            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

//    private static void editarNomeMago(Mago busca) {
//
//        try {
//
//            String nome = Console.lerString("\nInforme o novo nome: ");
//
//            busca.setNome(nome);
//
//            Db.salvarMagoNoArquivo();
//
//            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarNivelMago(Mago busca) {
//
//        try {
//
//            int nivel = Console.lerInt("\nInforme o novo nível: ");
//
//            busca.setNivel(nivel);
//
//            Db.salvarMagoNoArquivo();
//
//            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarPontosVidaMago(Mago busca) {
//
//        try {
//
//            int pontosVida = Console.lerInt("\nInforme os novos pontos de vida: ");
//
//            busca.setPontosVida(pontosVida);
//
//            Db.salvarMagoNoArquivo();
//
//            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarForcaMago(Mago busca) {
//
//        try {
//
//            int atributoAtaque = Console.lerInt("\nInforme o novo atributo de ataque: ");
//
//            busca.setForca(atributoAtaque);
//
//            Db.salvarMagoNoArquivo();
//
//            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarBonusAtaqueMago(Mago busca) {
//
//        try {
//
//            int bonusAtaque = Console.lerInt("\nInforme o novo bônus de ataque: ");
//
//            busca.setBonusAtaque(bonusAtaque);
//
//            Db.salvarMagoNoArquivo();
//
//            System.out.println("\nPersonagens.Mago atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }

    private static void editarSuporte(Suporte busca) {

        try {

            System.out.println("\nInforme os novos dados:");

            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida = Console.lerInt("Quantidade de vida: ");
            int atributoAtaque = Console.lerInt("Atributo de Ataque: ");
            int bonusCura = Console.lerInt("Bônus de Cura: ");

            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setCura(bonusCura);

            Db.salvarSuporteNoArquivo();

            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

//    private static void editarNomeSuporte(Suporte busca) {
//
//        try {
//
//            String nome = Console.lerString("\nInforme o novo nome: ");
//
//            busca.setNome(nome);
//
//            Db.salvarSuporteNoArquivo();
//
//            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarNivelSuporte(Suporte busca) {
//
//        try {
//
//            int nivel = Console.lerInt("\nInforme o novo nível: ");
//
//            busca.setNivel(nivel);
//
//            Db.salvarSuporteNoArquivo();
//
//            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarPontosVidaSuporte(Suporte busca) {
//
//        try {
//
//            int pontosVida = Console.lerInt("\nInforme os novos pontos de vida: ");
//
//            busca.setPontosVida(pontosVida);
//
//            Db.salvarSuporteNoArquivo();
//
//            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarForcaSuporte(Suporte busca) {
//
//        try {
//
//            int atributoAtaque = Console.lerInt("\nInforme o novo atributo de ataque: ");
//
//            busca.setForca(atributoAtaque);
//
//            Db.salvarSuporteNoArquivo();
//
//            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarBonusAtaqueSuporte(Suporte busca) {
//
//        try {
//
//            int bonusCura = Console.lerInt("\nInforme o novo bônus de cura: ");
//
//            busca.setCura(bonusCura);
//
//            Db.salvarSuporteNoArquivo();
//
//            System.out.println("\nPersonagens.Suporte atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }

    private static void editarVilao(Vilao busca) {

        try {

            System.out.println("\nInforme os novos dados:");

            String nome = Console.lerString("Nome: ");
            int nivel = Console.lerInt("Nível: ");
            int pontosVida = Console.lerInt("Quantidade de vida: ");
            int atributoAtaque = Console.lerInt("Atributo de Ataque: ");
            int poderDoMal = Console.lerInt("Atributo de poder do mal: ");

            busca.setNome(nome);
            busca.setNivel(nivel);
            busca.setPontosVida(pontosVida);
            busca.setForca(atributoAtaque);
            busca.setPoderDoMal(poderDoMal);

            Db.salvarVilaoNoArquivo();

            System.out.println("\nPersonagens.Vilao atualizado: " + busca.exibirDados() + "\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

//    private static void editarNomeVilao(Vilao busca) {
//
//        try {
//
//            String nome = Console.lerString("\nInforme o novo nome: ");
//
//            busca.setNome(nome);
//
//            Db.salvarVilaoNoArquivo();
//
//            System.out.println("\nVilão atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarNivelVilao(Vilao busca) {
//
//        try {
//
//            int nivel = Console.lerInt("\nInforme o novo nível: ");
//
//            busca.setNivel(nivel);
//
//            Db.salvarVilaoNoArquivo();
//
//            System.out.println("\nVilão atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarPontosVidaVilao(Vilao busca) {
//
//        try {
//
//            int pontosVida = Console.lerInt("\nInforme os novos pontos de vida: ");
//
//            busca.setPontosVida(pontosVida);
//
//            Db.salvarVilaoNoArquivo();
//
//            System.out.println("\nVilão atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarForcaVilao(Vilao busca) {
//
//        try {
//
//            int atributoAtaque = Console.lerInt("\nInforme o novo atributo de ataque: ");
//
//            busca.setForca(atributoAtaque);
//
//            Db.salvarVilaoNoArquivo();
//
//            System.out.println("\nVilão atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private static void editarBonusAtaqueVilao(Vilao busca) {
//
//        try {
//
//            int poderDoMal = Console.lerInt("\nInforme o novo bônus de poder do mal: ");
//
//            busca.setPoderDoMal(poderDoMal);
//
//            Db.salvarVilaoNoArquivo();
//
//            System.out.println("\nVilão atualizado: " + busca.exibirDados() + "\n");
//
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }

//----------------------------------------------------------MENU-LISTAR-PERSONAGENS-E-SEUS-MÉTODOS--------------------------------------------

    private static void switchListarPersonagem(int opListar) {
        int opEsp;
        switch (opListar) {
            case 1:
                System.out.println("Deseja listar Todos os Guerreiros ou um Específico?");
                opEsp = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEsp == 1) {
                    listarTodosGuerreiros();
                    break;
                }
                listarGuerreiro();
                break;
            case 2:
                System.out.println("Deseja listar Todos os Magos ou um Específico?");
                opEsp = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEsp == 1) {
                    listarTodosMagos();
                    break;
                }
                listarMago();
                break;
            case 3:
                System.out.println("Deseja listar Todos os Suportes ou um Específico?");
                opEsp = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEsp == 1) {
                    listarTodosSuportes();
                    break;
                }
                listarSuporte();
                break;
            case 4:
                System.out.println("Deseja listar Todos os Vilões ou um Específico?");
                opEsp = Console.lerInt("1 - Todos\n2 - Específico");
                if (opEsp == 1) {
                    listarTodosViloes();
                    break;
                }
                listarVilao();
                break;
            case 5:
                listarTodosPersonagens();
                break;
            case 0:
                System.out.println("\nVoltando ao menu...");
                return;
            default:
                System.out.println("Opção invalida...");
                System.out.println("Tente novamente");
                break;
        }
    }

    private static void menuListarPersonagem() {

        System.out.println("\nMenu Listar");
        System.out.println("1) Listar Personagens.Guerreiro");
        System.out.println("2) Listar Personagens.Mago");
        System.out.println("3) Listar Personagens.Suporte");
        System.out.println("4) Listar Personagens.Vilão");
        System.out.println("5) Listar Todos os Personagens");
        System.out.println("0) Voltar");

    }

    private static void menuListarGuerreiro() {

        System.out.println("\nMenu lista Personagens.Guerreiro");
        System.out.println("1) Listar guerreiro específico");
        System.out.println("2) Listar todos os Guerreiros");
        System.out.println("0) Voltar");

    }

    private static void menuListarMago() {

        System.out.println("\nMenu lista Personagens.Mago");
        System.out.println("1) Listar mago específico");
        System.out.println("2) Listar todos os magos");
        System.out.println("0) Voltar");

    }

    private static void menuListarSuporte() {

        System.out.println("\nMenu lista Personagens.Suporte");
        System.out.println("1) Listar suporte específico");
        System.out.println("2) Listar todos os suportes");
        System.out.println("0) Voltar");

    }

    private static void menuListarVilao() {

        System.out.println("\nMenu lista Vilão");
        System.out.println("1) Listar vilão específico");
        System.out.println("2) Listar todos os Vilões");
        System.out.println("0) Voltar");

    }

    private static void listarGuerreiro() {

        try {

            CadastroPersonagem.verificarListaGuerreiroVazia();
            String nome = Console.lerString("Informe o nome do guerreiro: ");
            Guerreiro busca = CadastroPersonagem.buscarGuerreiro(nome);
            System.out.println("Personagens.Guerreiro localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarMago() {

        try {

            CadastroPersonagem.verificarListaMagoVazia();
            String nome = Console.lerString("Informe o nome do Personagens.Mago: ");
            Mago busca = CadastroPersonagem.buscarMago(nome);
            System.out.println("Personagens.Mago localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarSuporte() {

        try {

            CadastroPersonagem.verificarListaSuporteVazia();
            String nome = Console.lerString("Informe o nome do Personagens.Suporte: ");
            Suporte busca = CadastroPersonagem.buscarSuporte(nome);
            System.out.println("Personagens.Suporte localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarVilao() {

        try {

            CadastroPersonagem.verificarListaVilaoVazia();
            String nome = Console.lerString("Informe o nome do Vilão: ");
            Vilao busca = CadastroPersonagem.buscarVilao(nome);
            System.out.println("Vilão localizado: " + busca.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosGuerreiros() {

        ArrayList<Guerreiro> listaGuerreiros = CadastroPersonagem.getListaGuerreiro();

        try {
            CadastroPersonagem.verificarListaGuerreiroVazia();

            System.out.println("\nGuerreiros cadastrados:");
            for (Guerreiro tempGuerreiro : listaGuerreiros) {

                System.out.println(tempGuerreiro.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
    }

    private static void listarTodosMagos() {

        ArrayList<Mago> listaMagos = CadastroPersonagem.getListaMago();

        try {
            CadastroPersonagem.verificarListaMagoVazia();

            System.out.println("\nMagos cadastrados:");
            for (Mago tempMago : listaMagos) {

                System.out.println(tempMago.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosSuportes() {

        ArrayList<Suporte> listaSuportes = CadastroPersonagem.getListaSuporte();

        try {
            CadastroPersonagem.verificarListaSuporteVazia();

            System.out.println("\nSuportes cadastrados:");
            for (Suporte tempSuporte : listaSuportes) {

                System.out.println(tempSuporte.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosViloes() {

        ArrayList<Vilao> listaViloes = CadastroPersonagem.getListaVilao();

        try {
            CadastroPersonagem.verificarListaVilaoVazia();

            System.out.println("\nVilões cadastrados:");
            for (Vilao tempVilao : listaViloes) {

                System.out.println(tempVilao.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodosPersonagens() {

        ArrayList<Personagem> listaPersonagens = CadastroPersonagem.getListaPersonagens();

        try {
            CadastroPersonagem.verificarListaPersonagemVazia();

            System.out.println("\nPersonagens cadastrados:");
            for (Personagem Personagem : listaPersonagens) {

                System.out.println(Personagem.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

//------------------------------------------------------------------MENU-EXCLUIR-PERSONAGENS---------------------------------------------------------------------------------------

    private static void switchDeletarPersonagem(int opDeletar) throws Exception {
        int opEspDel;
        switch (opDeletar) {
            case 1:
                System.out.println("Deseja deletar Todos os Guerreiros ou um Específico?");
                opEspDel = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEspDel == 1) {
                    excluirTodosGuerreiros();
                    break;
                }
                String nomeG = Console.lerString("Informe o nome do Guerreiro: ");
                Guerreiro guerreiro = CadastroPersonagem.buscarGuerreiro(nomeG);
                excluirGuerreiro(guerreiro);
                break;
            case 2:
                System.out.println("Deseja deletar Todos os Magos ou um Específico?");
                opEspDel = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEspDel == 1) {
                    excluirTodosMagos();
                    break;
                }
                String nomeM = Console.lerString("Informe o nome do Mago: ");
                Mago mago = CadastroPersonagem.buscarMago(nomeM);
                excluirMago(mago);
                break;
            case 3:
                System.out.println("Deseja deletar Todos os Suportes ou um Específico?");
                opEspDel = Console.lerInt("1 - Todos\n2 - Específico:");
                if (opEspDel == 1) {
                    excluirTodosSuportes();
                    break;
                }
                String nomeS = Console.lerString("Informe o nome do Suporte: ");
                Suporte suporte = CadastroPersonagem.buscarSuporte(nomeS);
                excluirSuporte(suporte);
                break;
            case 4:
                System.out.println("Deseja deletar Todos os Vilões ou um Específico?");
                opEspDel = Console.lerInt("1 - Todos\n2 - Específico");
                if (opEspDel == 1) {
                    excluirTodosViloes();
                    break;
                }
                String nomeV = Console.lerString("Informe o nome do Vilão: ");
                Vilao vilao = CadastroPersonagem.buscarVilao(nomeV);
                excluirVilao(vilao);
                break;
            case 5:
                excluirTodosGuerreiros();
                excluirTodosMagos();
                excluirTodosSuportes();
                excluirTodosViloes();
                break;
            case 0:
                System.out.println("Voltando...");
                return;
            default:
                System.out.println("Opção invalida...");
                System.out.println("Tente novamente");
                break;
        }
    }

    private static void menuExcluirPersonagem() {

        System.out.println("\nMENU EXCLUIR");
        System.out.println("1) Personagens.Guerreiro");
        System.out.println("2) Personagens.Mago");
        System.out.println("3) Personagens.Suporte");
        System.out.println("4) Personagens.Vilão");
        System.out.println("5) Todos");
        System.out.println("0) Voltar");

    }

//    private static void menuExcluirGuerreiros() {
//
//        System.out.println("\nMENU EXCLUIR GUERREIROS");
//        System.out.println("1) Excluir um guerreiro");
//        System.out.println("2) Excluir todos os guerreiros");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuExcluirMagos() {
//
//        System.out.println("\nMENU EXCLUIR MAGOS");
//        System.out.println("1) Excluir um mago");
//        System.out.println("2) Excluir todos os magos");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuExcluirSuportes() {
//
//        System.out.println("\nMENU EXCLUIR SUPORTES");
//        System.out.println("1) Excluir um suporte");
//        System.out.println("2) Excluir todos os suportes");
//        System.out.println("0) Voltar");
//
//    }
//
//    private static void menuExcluirViloes() {
//
//        System.out.println("\nMENU EXCLUIR VILÕES");
//        System.out.println("1) Excluir um vilão");
//        System.out.println("2) Excluir todos os vilões");
//        System.out.println("0) Voltar");
//
//    }

    private static void excluirGuerreiro(Guerreiro busca) {

        try {

            CadastroPersonagem.removerGuerreiro(busca);

            Db.salvarSuporteNoArquivo();

            System.out.println("\nPersonagens.Guerreiro " + busca.getNome() + " excluído com sucesso!");


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirMago(Mago busca) {

        try {

            CadastroPersonagem.removerMago(busca);

            Db.salvarSuporteNoArquivo();

            System.out.println("\nPersonagens.Mago " + busca.getNome() + " excluído com sucesso!");


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirSuporte(Suporte busca) {

        try {

            CadastroPersonagem.removerSuporte(busca);

            Db.salvarSuporteNoArquivo();

            System.out.println("\nPersonagens.Suporte " + busca.getNome() + " excluído com sucesso!");


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirVilao(Vilao busca) {

        try {

            CadastroPersonagem.removerVilao(busca);

            Db.salvarSuporteNoArquivo();

            System.out.println("\nPersonagens.Vilao " + busca.getNome() + " excluído com sucesso!");


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void excluirTodosGuerreiros() {

        ArrayList<Guerreiro> listaGuerreiros = CadastroPersonagem.getListaGuerreiro();

        try {

            CadastroPersonagem.verificarListaGuerreiroVazia();
            listaGuerreiros.clear();
            System.out.println("Guerreiros excluídos com sucesso! ");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void excluirTodosMagos() {

        ArrayList<Mago> listaMagos = CadastroPersonagem.getListaMago();

        try {

            CadastroPersonagem.verificarListaMagoVazia();
            listaMagos.clear();
            System.out.println("Magos excluídos com sucesso! ");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void excluirTodosSuportes() {

        ArrayList<Suporte> listaSuportes = CadastroPersonagem.getListaSuporte();

        try {

            CadastroPersonagem.verificarListaSuporteVazia();
            listaSuportes.clear();
            System.out.println("Suportes excluídos com sucesso! ");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void excluirTodosViloes() {

        ArrayList<Vilao> listaViloes = CadastroPersonagem.getListaVilao();

        try {

            CadastroPersonagem.verificarListaVilaoVazia();
            listaViloes.clear();
            System.out.println("Vilões excluídos com sucesso! ");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

//------------------------------------------------------------------MENU-COMBATE---------------------------------------------------------------------------------------

    private static Personagem escolherPersonagem() throws Exception {
        String nome;
        int escolhaClasse;

        System.out.println("\n1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Suporte");
        escolhaClasse = Console.lerInt("\nEscolha a classe do personagem para o combate:");

        switch (escolhaClasse) {
            case 1:
                try {
                    CadastroPersonagem.verificarListaGuerreiroVazia();
                    listarTodosGuerreiros();
                    nome = Console.lerString("\nEscolha o guerreiro para o combate: ");
                    return CadastroPersonagem.buscarGuerreiro(nome);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return escolherPersonagem();
                }
            case 2:
                try {
                    CadastroPersonagem.verificarListaMagoVazia();
                    listarTodosMagos();
                    nome = Console.lerString("\nEscolha o mago para o combate: ");
                    return CadastroPersonagem.buscarMago(nome);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return escolherPersonagem();
                }
            case 3:
                try {
                    CadastroPersonagem.verificarListaSuporteVazia();
                    listarTodosSuportes();
                    nome = Console.lerString("\nEscolha o suporte para o combate: ");
                    return CadastroPersonagem.buscarSuporte(nome);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return escolherPersonagem();
                }
            default:
                System.out.println("Escolha inválida!");
                return escolherPersonagem();
        }
    }

    private static Vilao escolherVilao() throws Exception {
        try {
            listarTodosViloes();
            String nome = Console.lerString("Informe o nome do Vilão: ");
            return CadastroPersonagem.buscarVilao(nome);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return escolherVilao();
        }
    }

    private static void iniciarCombateMenu() {
        try {
            Personagem personagem = escolherPersonagem();
            Vilao vilao = escolherVilao();
            System.out.println("entrou devagarinho");
            Combate combate = new Combate(personagem, vilao);
            combate.iniciarCombate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//------------------------------------------------------------------EXECUTAR-PROGRAMA---------------------------------------------------------------------------------------

    public static void executar() throws Exception {

        try {
            Db.criarArquivoSeNaoExistir();
            Db.lerGuerreiroDoArquivo();
            Db.lerMagoDoArquivo();
            Db.lerSuporteDoArquivo();
            Db.lerVilaoDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while (true) {
            exibirMenu();
            menuPrincipal();
        }

    }

}

