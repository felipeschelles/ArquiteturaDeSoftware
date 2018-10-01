package br.edu.up.arquitetura.biblioteca.model.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Mutuario;
import br.edu.up.arquitetura.biblioteca.model.persistencia.MutuarioPersistencia;

public class MutuarioNegocio {
	
	private MutuarioPersistencia persist = new MutuarioPersistencia();
	
	public ArrayList<Mutuario> listarTodos(){
		return persist.list();
	}
	
	public Mutuario cadastrar(Mutuario mutuario){
		//RNGs
		return persist.insert(mutuario);
	}

	public Mutuario update(Mutuario mutuario) {
		return persist.update(mutuario);
		
	}
	
	public Mutuario buscaPorId(int id) {	   
	   	  return persist.buscaPorId(id);
	}

	public List<Mutuario> find(String filter) {
		// TODO Auto-generated method stub
		return persist.find(filter);
	}

}
