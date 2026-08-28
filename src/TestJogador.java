
class TestJogador {

    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[3];

        for (int i = 0; i < 3; i++) {
            jogadores[i] = new Jogador();
        }
        jogadores[0].nome = "Pedro";
        jogadores[1].nome = "João";
        jogadores[2].nome = "Maria";

        for (int x = 0; x < 5; x++) {
            jogadores[0].marcarPonto();
        }

        for (int y = 0; y < 3; y++) {
            jogadores[1].marcarPonto();
        }

        for (int z = 0; z < 7; z++) {
            jogadores[2].marcarPonto();
        }

        for (int d = 0; d < 3; d++) {
            jogadores[d].mostrarPontos();
        }
    }
}
