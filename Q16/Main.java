package Q16;

public class Main {

  public static void main(String[] args) {

      // criando agenda
      Agenda agenda = new Agenda();

      // criando contatos
      Contato c1 = new Contato("Ana", "11111-1111");
      Contato c2 = new Contato("Carlos", "99999-9999");
      Contato c3 = new Contato("Maria", "00000-0000");

      // adicionando contatos
      agenda.adicionarContato(c1);
      agenda.adicionarContato(c2);
      agenda.adicionarContato(c3);

      // listando contatos
      agenda.listarContatos();

      // pesquisando contato
      System.out.println("\nPESQUISA");
      agenda.pesquisarContato("Maria");
  }
}