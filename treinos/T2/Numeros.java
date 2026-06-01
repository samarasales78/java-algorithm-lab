package treinos.T2;

public class Numeros {

  private int[] valores;

  public Numeros(int[] valores) {
    this.valores = valores;
  }
  
  public int somarElementos() {

    int soma = 0;

    for (int i = 0; i < valores.length; i++) {
      soma += valores[i];
    }

    return soma;
  }
}
