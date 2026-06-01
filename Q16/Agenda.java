package Q16;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contato> contatos;

  public Agenda() {
    contatos = new ArrayList<>();
  }

  public void adicionarContato(Contato contato) {
    contatos.add(contato);
  }

  public void listarContatos() {
    for (Contato c : contatos) {
      c.exibirContato();
    }
  }

  public void pesquisarContato(String nome) {
    
    for (Contato c : contatos) {

      if (c.getNome().equalsIgnoreCase(nome)) {
        c.exibirContato();
        return;
      }
    }

      System.out.println("Contato não encontrado.");
  }
}