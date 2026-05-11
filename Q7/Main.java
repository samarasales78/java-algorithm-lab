package Q7;

public class Main {
  public static void main(String[] args) {

    Jogador j1 = new Jogador ("Tutankhamon");

    j1.adicionarPontos(22);
    System.out.println("Pontuacao após ganhar pontos: " + j1.verificarPontuacao());

    j1.perderPontos(10);
    System.out.println("Pontuacao após perder pontos: " + j1.verificarPontuacao());

    j1.perderPontos(12);
    System.out.println("Pontuacao após perder pontos: " + j1.verificarPontuacao());
  }
}
