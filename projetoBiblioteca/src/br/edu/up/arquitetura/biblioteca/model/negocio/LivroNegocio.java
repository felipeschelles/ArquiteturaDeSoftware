package br.edu.up.arquitetura.biblioteca.model.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Livro;
import br.edu.up.arquitetura.biblioteca.model.persistencia.LivroPersistencia;

public class LivroNegocio {
	
	private LivroPersistencia persist = new LivroPersistencia();
	private AutorNegocio autorNegocio = new AutorNegocio();
	
	public ArrayList<Livro> listarTodos(){
		return persist.list();
	}
	
	public Livro cadastrar(Livro livro){
		//RNGs
		livro.setEmprestado(false);
		livro.setAutor(autorNegocio.find("").get(livro.getAutor().getId()));
		return persist.insert(livro);
	}
	
	public Livro update(Livro livro){
		//RNGs
		return persist.update(livro);
	}

	public List<Livro> find(String filter) {
		// TODO Auto-generated method stub
		return persist.find(filter);
	}

}
