package Ferramentas;

import Personagens.*;

import java.util.ArrayList;

public class CadastroPersonagem {

    private static final ArrayList<Personagem> listaPersonagem = new ArrayList<>();
    private static final ArrayList<Guerreiro> listaGuerreiro = new ArrayList<>();
    private static final ArrayList<Mago> listaMago = new ArrayList<>();
    private static final ArrayList<Suporte> listaSuporte = new ArrayList<>();
    private static final ArrayList<Vilao> listaVilao = new ArrayList<>();

    // --------------- CADASTRO ---------------

    public static void cadastrarGuerreiro(Guerreiro guerreiro){
        listaGuerreiro.add(guerreiro);
    }

    public static void cadastrarMago(Mago mago){
        listaMago.add(mago);
    }

    public static void cadastrarSuporte(Suporte suporte){
        listaSuporte.add(suporte);
    }

    public static void cadastrarVilao(Vilao vilao){
        listaVilao.add(vilao);
    }

    // ---------------------------------------

    // --------------- REMOVER ---------------

    public static void removerGuerreiro(Guerreiro guerreiro){
        listaGuerreiro.remove(guerreiro);
    }

    public static void removerMago(Mago mago){
        listaMago.remove(mago);
    }

    public static void removerSuporte(Suporte suporte){
        listaSuporte.remove(suporte);
    }

    public static void removerVilao(Vilao vilao){
        listaVilao.remove(vilao);
    }

    // ---------------------------------------

    // --------------- BUSCAR ---------------

    public static ArrayList<Personagem> getListaPersonagens() {
        return listaPersonagem;
    }

    public static Guerreiro buscarGuerreiro(String nome) throws Exception{
        
        for (Guerreiro tempGuerreiro : listaGuerreiro){

            if (tempGuerreiro.getNome().contains(nome)){
                return tempGuerreiro;
            }

        }

        throw new Exception("\nPersonagens.Guerreiro não encontrado");

    }

    public static Mago buscarMago(String nome) throws Exception{
        
        for (Mago tempMago : listaMago){

            if (tempMago.getNome().contains(nome)){
                return tempMago;
            }

        }

        throw new Exception("\nPersonagens.Mago não encontrado");

    }

    public static Suporte buscarSuporte(String nome) throws Exception{
        
        for (Suporte tempSuporte : listaSuporte){

            if (tempSuporte.getNome().contains(nome)){
                return tempSuporte;
            }

        }

        throw new Exception("\nPersonagens.Suporte não encontrado");

    }

    public static Vilao buscarVilao(String nome) throws Exception{
        
        for (Vilao tempVilao : listaVilao){

            if (tempVilao.getNome().contains(nome)){
                return tempVilao;
            }

        }

        throw new Exception("\nVilão não encontrado");

    }

    // ---------------------------------------

    // --------------- VERIFICAR SE ESTÁ VAZIO ---------------

    public static void verificarListaPersonagemVazia() throws Exception{
        if (listaPersonagem.isEmpty()){
            throw new Exception("\nNão há personagens cadastrados");
        }
    }

    public static void verificarListaGuerreiroVazia() throws Exception{
        if (listaGuerreiro.isEmpty()){
            throw new Exception("\nNão há guerreiros cadastrados");
        }
    }

    public static void verificarListaMagoVazia() throws Exception{
        if (listaMago.isEmpty()){
            throw new Exception("\nNão há magos cadastrados");
        }
    }

    public static void verificarListaSuporteVazia() throws Exception{
        if (listaSuporte.isEmpty()){
            throw new Exception("\nNão há suportes cadastrados");
        }
    }

    public static void verificarListaVilaoVazia() throws Exception{
        if (listaVilao.isEmpty()){
            throw new Exception("\nNão há vilões cadastrados");
        }
    }

    // ---------------------------------------

    // --------------- RETURNS ---------------

    public static ArrayList<Guerreiro> getListaGuerreiro(){
        return listaGuerreiro;
    }

    public static ArrayList<Mago> getListaMago(){
        return listaMago;
    }

    public static ArrayList<Suporte> getListaSuporte(){
        return listaSuporte;
    }

    public static ArrayList<Vilao> getListaVilao(){
        return listaVilao;
    }

    // ---------------------------------------

}
