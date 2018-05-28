package br.com.caelum.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.model.Contato;

public class TesteConsulta {

	public static void main(String[] args) {
		List<Contato> contatos = new ArrayList<>();
		ContatoDAO dao = new ContatoDAO();
		contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		
	}

	}
}