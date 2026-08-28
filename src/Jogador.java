
class Jogador {
    String nome;
    int pontos;
    
    void marcarPonto() {
       pontos = pontos + 1;
    }
    
    void mostrarPontos() {
        System.out.println("Jogador: " + nome);
        System.out.println("Pontos: " + pontos);
    }
}
