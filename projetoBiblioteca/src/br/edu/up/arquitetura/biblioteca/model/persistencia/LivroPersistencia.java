package br.edu.up.arquitetura.biblioteca.model.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Livro;
import br.edu.up.arquitetura.biblioteca.model.dominio.Mutuario;

public class LivroPersistencia {
	
	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public Livro insert(Livro livro){	
		
	       	  livro.setId(livros.size());	
	       	  livros.add(livro);
	       	  
     
   	  return livros.get(livro.getId());
	}
	
	public ArrayList<Livro> list(){
		return livros;
	}
	
	
	public List<Livro> find(String filter){
		return livros;
	}
	
	public Livro update(Livro livro){
		livros.remove(livro.getId());
		livros.add(livro.getId(), livro);
		return livros.get(livro.getId());
	}

}
