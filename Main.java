import java.util.Random; //para o dado
import java.util.Scanner; //para escrever os nomes dos jogadores

public class Main {
    public static void main(String[] args) { //cria o metodo principal
        Scanner sc = new Scanner(System.in);
        Random dado = new Random(); //dado

        // 1. Pedir o nome do Jogador 1
        System.out.print("Nome do Jogador 1: ");
        Player p1 = new Player(sc.nextLine()); // mete o objeto com o nome do jogador

        // 2. Pedir o nome do Jogador 2
        System.out.print("Nome do Jogador 2: ");
        Player p2 = new Player(sc.nextLine()); //a mesma coisa

        System.out.println("\n--- ESTADO INICIAL DA CORRIDA ---"); //ambos comecam na posicao 0, para depois ter a pole position
        System.out.println(p1.name + " esta na casa: " + p1.position);
        System.out.println(p2.name + " esta na casa: " + p2.position);

        sc.close();
    }
}
