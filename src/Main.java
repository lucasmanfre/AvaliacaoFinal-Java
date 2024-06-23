public class Main {
    public static void main(String[] args) {
        String nome = Console.lerString("Informe o nome: ");
        
        Guerreiro g1 = new Guerreiro(nome, "Guerreiro", 1, 100, 40, 10);
        System.out.println(g1.toString());
    }
}
