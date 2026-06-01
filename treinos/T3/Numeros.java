package treinos.T3;

public class Numeros {

  private int[] valores;

  public Numeros(int[] valores) {
    this.valores = valores;
  }

  public int contarImpares() {

    int impares = 0;

    for (int i = 0; i < valores.length; i++) {
      if (valores[i] % 2 != 0) {
        impares++; //impares += valores[i]; se quisesse somar os impares
      }
    }

    return impares;
  }
}