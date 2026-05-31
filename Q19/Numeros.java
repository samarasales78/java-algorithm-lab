package Q19;

public class Numeros {

  private int[] valores;

  public Numeros(int[] valores) {
    this.valores = valores;
  }

  public int contarPares() {

    int quantidade = 0;

    for (int i = 0; i < valores.length; i++) {

      if (valores[i] % 2 == 0) {
        quantidade++;
      }
    }

    return quantidade;
  }
}