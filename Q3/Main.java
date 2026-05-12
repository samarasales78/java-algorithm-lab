package Q3;

public class Main {
  
  public static void main(String[] args) {

    Calculadora c1 = new Calculadora(9, 3);
    System.out.println("Operador 1 = " + c1.op1 + "| Operador 2 = " + c1.op2);

    System.out.println("Soma = " + c1.somar());
    System.out.println("Subtração = " + c1.subtrair());
    System.out.println("Multiplicação = " + c1.multiplicar());
    System.out.println("Divisão = " + c1.dividir());
    System.out.println("Cálculo da Potência = " + c1.calcularPotencia());

  }
}
