import java.util.List;

// Neste ficheiro estão implementadas todas as casas especiais do tabuleiro.
// Cada classe representa uma casa e diz o que acontece ao jogador lá cair.
// Os efeitos seguem as regras do relatório do projeto.

// Casa sem efeito especial (a maioria do tabuleiro)
class CasaNormal implements Casa {
    @Override // substitui o metado "aplicarEfeito" definido na interface "Casa"
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Casa normal, não faz nada
    }
}

// Pneus Gastos (casas 6, 17 e 29)
// O jogador recua 2 casas e salta a próxima jogada.
class CasaPneusGastos implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Recua 2 casas
        jogador.position = jogador.position - 2;

        // Validação para não sair do tabuleiro (nunca abaixo do 0)
        if (jogador.position < 0) jogador.position = 0;

        // Ativa a flag para saltar a próxima jogada
        jogador.saltarJogada = true;
    }
}

// DRS Ativado (casas 10, 23 e 34)
// O jogador avança 3 casas.
class CasaDRS implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Avança 3 casas
        jogador.position = jogador.position + 3;

        // Validação para não ultrapassar a meta (nunca acima de 40)
        if (jogador.position > 40) jogador.position = 40;
    }
}

// Safety Car (casa 14)
// Todos os jogadores (incluindo quem caiu na casa) recuam 2 casas.
class CasaSafetyCar implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Percorre a lista de todos os jogadores no jogo
        for (Player p : todosJogadores) {
            p.position = p.position - 2;

            // Validação para nenhum jogador sair do tabuleiro
            if (p.position < 0) p.position = 0;
        }
    }
}

// Ultrapassagem (casa 20)
// O jogador avança 5 casas.
class CasaUltrapassagem implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Avança 5 casas
        jogador.position = jogador.position + 5;

        // Validação para não ultrapassar a meta
        if (jogador.position > 40) jogador.position = 40;
    }
}

// Bandeira Vermelha (casa 31)
// O jogador volta para a casa 25.
class CasaBandeiraVermelha implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Volta diretamente para a casa 25
        jogador.position = 25;
    }
}

// Final Sprint (casa 37)
// O jogador avança 2 casas.
class CasaSprintFinal implements Casa {
    @Override
    public void aplicarEfeito(Player jogador, List<Player> todosJogadores) {
        // Avança 2 casas
        jogador.position = jogador.position + 2;

        // Validação para não ultrapassar a meta
        if (jogador.position > 40) jogador.position = 40;
    }
}
