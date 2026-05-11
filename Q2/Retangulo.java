package Q2;

public class Retangulo {
  
  double largura;
  double altura;

  Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public double calcularPerimetro() {
    double resultado = this.altura * this.largura;
    return resultado;
  }

  public double calcularArea() {
    double resultado = 2 * (this.altura + this.largura);
    return resultado;
  }
}
