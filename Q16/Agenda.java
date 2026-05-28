package Q16;

import java.util.ArrayList;

public class Agenda {

    // ArrayList de contatos
    private ArrayList<Contato> contatos;

    // construtor
    public Agenda() {
        contatos = new ArrayList<>();
    }

    // adicionar contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // listar contatos
    public void listarContatos() {

        System.out.println("LISTA DE CONTATOS");

        for (Contato c : contatos) {
            c.exibirContato();
        }
    }

    // pesquisar contato pelo nome
    public void pesquisarContato(String nome) {

        boolean encontrado = false;

        for (Contato c : contatos) {

            if (c.getNome().equalsIgnoreCase(nome)) {
                c.exibirContato();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}