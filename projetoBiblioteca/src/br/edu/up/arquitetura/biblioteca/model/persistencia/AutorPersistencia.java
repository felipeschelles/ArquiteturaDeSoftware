package br.edu.up.arquitetura.biblioteca.model.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Autor;

public class AutorPersistencia {

	private static ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public Autor insert(Autor autor){	
   	 if (autor.getId() != 0) {
   	   
         autores.remove(autor.getId());
         autores.add(autor.getId(), autor);
		  
     } else {
    	 autor.setId(autores.size());	
    	 autores.add(autor);
     }
	  return autores.get(autor.getId()); 
	}
	
	public ArrayList<Autor> list(){
		return autores;
	}
	
	public List<Autor> find(String filter){
		return autores;
	}
	
	public Autor update(Autor autor){
		
		autores.remove(autor.getId());
		autores.add(autor.getId(), autor);
		return autores.get(autor.getId());
		
	}
}
