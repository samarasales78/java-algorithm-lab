package Q5;

public class Carro {
  
  public double consumo;
  public double combustivel;

  Carro(double consumo) {
    this.consumo = consumo;
    combustivel = 0;
  }

  public void abastecer(double litros) {
    combustivel = combustivel + litros; 
  }

  public void andar(double distancia) {
    double gasto = distancia / consumo;
    combustivel = combustivel - gasto;
  }

  public double exibirCombustivel() {
    return combustivel;
  }
}