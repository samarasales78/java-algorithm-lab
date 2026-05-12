package Q3;

public class Calculadora {
  
  public double op1;
  public double op2;

  Calculadora(double op1, double op2) {
    this.op1 = op1;
    this.op2 = op2;
  }

  public double somar() {
    double resultado = op1 + op2;
    return resultado;
  }

  public double subtrair() {
    double resultado = op1 - op2;
    return resultado;
  }

  public double multiplicar() {
    double resultado = op1 * op2;
    return resultado;
  }

  public double dividir() {
    double resultado = op1 / op2;
    return resultado;
  }

  public double calcularPotencia() {
    double resultado = Math.pow(op1, op2);
    return resultado;
  }
}