package br.edu.up.arquitetura.biblioteca.model.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Autor;
import br.edu.up.arquitetura.biblioteca.model.persistencia.AutorPersistencia;

public class AutorNegocio {

	private AutorPersistencia persist = new AutorPersistencia();
	
	public ArrayList<Autor> listarTodos(){
		return persist.list();
	}
	
	public Autor cadastrar(Autor autor){
		//RNGs
		return persist.insert(autor);
	}
	
	public List<Autor> find(String filter){
		return persist.find(filter);
	}

	public Autor update(Autor autor) {
		// TODO Auto-generated method stub
		return persist.update(autor);
	}
	

	
}
