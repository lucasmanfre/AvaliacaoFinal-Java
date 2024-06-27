import Ferramentas.*;

public class Main {

    public static void main(String[] args) {

        try {
            Sistema.executar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
