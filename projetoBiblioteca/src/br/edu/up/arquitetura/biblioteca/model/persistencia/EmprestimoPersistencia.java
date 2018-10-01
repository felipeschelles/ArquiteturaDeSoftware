package br.edu.up.arquitetura.biblioteca.model.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Emprestimo;
import br.edu.up.arquitetura.biblioteca.model.dominio.Mutuario;

public class EmprestimoPersistencia {
	

	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public Emprestimo insert(Emprestimo emprestimo){
		

		  	  emprestimo.setId(emprestimos.size());	
		  	  emprestimos.add(emprestimo);
		  	  
	     
	   	  return emprestimos.get(emprestimo.getId());
	}
	
	public ArrayList<Emprestimo> list(){
		return emprestimos;
	}
	
	public List<Emprestimo> find(String filter){
		return emprestimos;
	}
	
	public boolean findByMutuario(Mutuario mutuario) {
		for(int i=0; i < emprestimos.size(); i ++){
			if(emprestimos.get(i).getMutuario().getId() == mutuario.getId() && emprestimos.get(i).getDataDevolucao() == null){
				return true;
			}
		}   	   
	   	return false;
	}


	
	public Emprestimo devolver(Emprestimo emprestimo) {

		emprestimos.get(emprestimo.getId()).setDataDevolucao(emprestimo.getDataDevolucao());
		return emprestimos.get(emprestimo.getId());
	}

	public Emprestimo renovar(Emprestimo emprestimo) {
		emprestimos.get(emprestimo.getId()).setDataPrevistaDevolucao(emprestimo.getDataPrevistaDevolucao());
		return emprestimos.get(emprestimo.getId());
	}
	
	public Emprestimo update(Emprestimo emprestimo){
		
		emprestimos.remove(emprestimo.getId());
		emprestimos.add(emprestimo.getId(), emprestimo);
		return emprestimos.get(emprestimo.getId());
	}


}
