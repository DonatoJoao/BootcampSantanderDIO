package edu.joao.Collections.Set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void addContato(String nome, int numero){
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new HashSet<>();
        for (Contatos c : contatosSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        for (Contatos c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

}
