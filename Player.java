public class Player { //classe player
    String name;
    int position; // guarda a posição do jogador
    boolean saltarJogada;// Meti isto pq: flag para a regra dos pneus gastos (recua 2 e salta a jogada)

    // construtor - cria o jogador quando comeca o jogo
    public Player(String nome) {
        this.name = nome;
        this.position = 0; // Começa na casa 0
        this.saltarJogada = false; // NOVO: por defeito, joga sempre (só fica true se cair nos pneus)
    }

    public void mover(int valorDado) { //move o jogador consoante o valor do dado
        this.position = this.position + valorDado;
        if (this.position > 40) {
            this.position = 40; // cria uma linha invisivel para que o jogador nao ultrapasse a casa 40
        }
    }
}
