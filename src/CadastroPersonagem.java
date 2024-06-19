import java.util.List;
import java.util.ArrayList;

public class CadastroPersonagem {
    
    private static List<Personagem> listaPersonagem = new ArrayList<>();

    public static void salvarPersonagem(Personagem personagem){
        listaPersonagem.add(personagem);
    }

    public static List<Personagem> getListaPersonagem(){
        return listaPersonagem;
    }

}
