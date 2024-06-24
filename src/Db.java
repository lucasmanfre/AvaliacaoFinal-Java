import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Db {
    private static final String ARQUIVOGUERREIRO = "guerreiros.txt";
    private static final String ARQUIVOMAGO = "magos.txt";
    private static final String ARQUIVOSUPORTE = "suportes.txt";
    private static final String ARQUIVOVILAO = "viloes.txt";

    //------------- SALVAR NO ARQUIVO -------------

    public static void salvarGuerreiroNoArquivo() throws IOException {

        ArrayList<Guerreiro> listaGuerreiro = CadastroPersonagem.getListaGuerreiro();

        try (FileWriter fWriter = new FileWriter(ARQUIVOGUERREIRO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Guerreiro tempGuerreiro : listaGuerreiro) {

                bWriter.write(tempGuerreiro.toString() + "\n");

            }

        }

    }

    public static void salvarMagoNoArquivo() throws IOException {

        ArrayList<Mago> listaMago = CadastroPersonagem.getListaMago();

        try (FileWriter fWriter = new FileWriter(ARQUIVOMAGO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Mago tempMago : listaMago) {

                bWriter.write(tempMago.toString() + "\n");

            }

        }

    }

    public static void salvarSuporteNoArquivo() throws IOException {

        ArrayList<Suporte> listaSuporte = CadastroPersonagem.getListaSuporte();

        try (FileWriter fWriter = new FileWriter(ARQUIVOSUPORTE);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Suporte tempSuporte : listaSuporte) {

                bWriter.write(tempSuporte.toString() + "\n");

            }

        }

    }

    public static void salvarVilaoNoArquivo() throws IOException {

        ArrayList<Vilao> listaVilao = CadastroPersonagem.getListaVilao();

        try (FileWriter fWriter = new FileWriter(ARQUIVOVILAO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Vilao tempVilao : listaVilao) {

                bWriter.write(tempVilao.toString() + "\n");

            }

        }

    }

    //---------------------------------------------


    //------------- LER DO ARQUIVO -------------


    public static void lerGuerreiroDoArquivo() throws IOException {

        ArrayList<Guerreiro> listaGuerreiro = CadastroPersonagem.getListaGuerreiro();
        listaGuerreiro.clear();

        try (FileReader frReader = new FileReader(ARQUIVOGUERREIRO);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                Guerreiro tempGuerreiro = new Guerreiro();
                tempGuerreiro.fromString(linha);
                CadastroPersonagem.cadastrarGuerreiro(tempGuerreiro);

            }

        }

    }

    public static void lerMagoDoArquivo() throws IOException {

        ArrayList<Mago> listaMago = CadastroPersonagem.getListaMago();
        listaMago.clear();

        try (FileReader frReader = new FileReader(ARQUIVOMAGO);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                Mago tempMago = new Mago();
                tempMago.fromString(linha);
                CadastroPersonagem.cadastrarMago(tempMago);

            }

        }

    }

    public static void lerSuporteDoArquivo() throws IOException {

        ArrayList<Suporte> listaSuporte = CadastroPersonagem.getListaSuporte();
        listaSuporte.clear();

        try (FileReader frReader = new FileReader(ARQUIVOSUPORTE);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                Suporte tempSuporte = new Suporte();
                tempSuporte.fromString(linha);
                CadastroPersonagem.cadastrarSuporte(tempSuporte);

            }

        }

    }

    public static void lerVilaoDoArquivo() throws IOException {

        ArrayList<Vilao> listaVilao = CadastroPersonagem.getListaVilao();
        listaVilao.clear();

        try (FileReader frReader = new FileReader(ARQUIVOVILAO);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                Vilao tempVilao = new Vilao();
                tempVilao.fromString(linha);
                CadastroPersonagem.cadastrarVilao(tempVilao);

            }

        }

    }

    //---------------------------------------------

    public static void criarArquivoSeNaoExistir() {

        try {
            File arquivoGuerreiro = new File(ARQUIVOGUERREIRO);
            File arquivoMago = new File(ARQUIVOMAGO);
            File arquivoSuporte = new File(ARQUIVOSUPORTE);
            File arquivoVilao = new File(ARQUIVOVILAO);

            if (!arquivoGuerreiro.exists()) {
                arquivoGuerreiro.createNewFile();
            }
            if(!arquivoMago.exists()){
                arquivoMago.createNewFile();
            }
            if(!arquivoSuporte.exists()){
                arquivoSuporte.createNewFile();
            }
            if(!arquivoVilao.exists()){
                arquivoVilao.createNewFile();
            }

        } catch (IOException exception) {

            exception.printStackTrace();
        }

    }
}
