package Q1;
public class Ingresso {
  
  String nome_evento;
  double valor_ingresso;
  
  Ingresso(String nome_evento, double valor_ingresso) {
    this.nome_evento = nome_evento;
    this.valor_ingresso = valor_ingresso;
  }
  public double exibeValor() {
    return valor_ingresso;
  }

  public String imprimeEvento() {
    return "Evento: " + nome_evento + ", Valor: " + valor_ingresso;
  }
}
