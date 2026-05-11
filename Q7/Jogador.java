package Q7;

public class Jogador {

  public String nome;
  public int pontuacao;

  Jogador(String nome) {
    this.nome = nome;
    pontuacao = 0;
  }

  public void adicionarPontos(int pontos) {
    pontuacao = pontuacao + pontos;
  }

  public void perderPontos(int pontos) {

    if (pontuacao - pontos > 0) {
      pontuacao = pontuacao - pontos;
    } else {
      pontuacao = 0;
    }
  }

  public int verificarPontuacao() {
    return pontuacao;
  }
}
