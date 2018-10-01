package br.edu.up.arquitetura.biblioteca.model.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Mutuario;

public class MutuarioPersistencia {

	private static ArrayList<Mutuario> mutuarios = new ArrayList<Mutuario>();
	
	public Mutuario insert(Mutuario mutuario){
		
	   	 if (mutuario.getId() != 0 ) {
	   	  
	            mutuarios.remove(mutuario.getId());
	            mutuarios.add(mutuario.getId(), mutuario);
	  		  
	        } else {
	       	 mutuario.setId(mutuarios.size()+1);	
	       	 mutuarios.add(mutuario);
	            	
	                
	            }
	  	  return mutuarios.get(mutuario.getId()-1);   
	}
	
	public ArrayList<Mutuario> list(){
		return mutuarios;
	}
	
	public List<Mutuario> find(String filter){
		return mutuarios;
	}
	
	public Mutuario buscaPorId(int id) {
	   	   
	   	  return mutuarios.get(id-1);
	}
	
	public Mutuario update(Mutuario mutuario){
		mutuarios.remove(mutuario.getId());
		mutuarios.add(mutuario.getId(), mutuario);
		return mutuarios.get(mutuario.getId());
	}
	
}
