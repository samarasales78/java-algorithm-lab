package Q11;

public class Numeros {
  
  private int[] valores;

  public Numeros(int[] valores) {
    this.valores = valores;
  }

  public int calcularSoma() {
    int soma = 0;

    for (int i = 0; i < valores.length; i++) {
      soma += valores[i];
    }

    return soma;
  }
}
