import java.util.List;
// Interface que representa uma casa do tabuleiro.
// Cada tipo de casa (normal, DRS, pneus, etc.) vai implementar esta interface.

public interface Casa {
    // Metodo que aplica o efeito da casa quando o jogador cai nela.
    // Recebe o jogador que caiu e a lista de todos os jogadores (necessário para o Safety Car).
    void aplicarEfeito(Player jogador, List<Player> todosJogadores);
}
