package br.edu.up.arquitetura.biblioteca.model.negocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.edu.up.arquitetura.biblioteca.model.dominio.Emprestimo;
import br.edu.up.arquitetura.biblioteca.model.dominio.Livro;
import br.edu.up.arquitetura.biblioteca.model.persistencia.EmprestimoPersistencia;
import br.edu.up.arquitetura.biblioteca.model.persistencia.LivroPersistencia;

public class EmprestimoNegocio {
	
	private EmprestimoPersistencia persist = new EmprestimoPersistencia();
	private LivroNegocio livroNegocio = new LivroNegocio();
	private MutuarioNegocio mutuarioNegocio = new MutuarioNegocio();
	
	public ArrayList<Emprestimo> listarTodos(){
		return persist.list();
	}
	
	public Emprestimo cadastrar(Emprestimo emprestimo){
		//RNGs
		return persist.insert(validarEmprestimo(emprestimo));
		
	}
	
	public Emprestimo validarEmprestimo(Emprestimo emprestimo){
		
		Livro livro = livroNegocio.find("").get(emprestimo.getLivro().getId());
		if(livro.isEmprestado()) {
			return null;
		}else{
			if(persist.findByMutuario(emprestimo.getMutuario())) {
				return null;
			}else{
				emprestimo.setLivro(livroNegocio.find("").get(emprestimo.getLivro().getId()));
				emprestimo.setMutuario(mutuarioNegocio.find("").get(emprestimo.getMutuario().getId()-1));
				emprestimo.getLivro().setEmprestado(true);
				emprestimo.setDataPrevistaDevolucao(multa(emprestimo).getTime());
				return emprestimo;
			}
		}
		
	}
	
	public Emprestimo update(Emprestimo emprestimo){
		if(emprestimo.getDataDevolucao()!=null){
			Livro livro = livroNegocio.find("").get(emprestimo.getLivro().getId());
			livro.setEmprestado(false);
		}
		
		return persist.update(emprestimo);
	}
	

	
	public Calendar multa (Emprestimo emprestimo){
		
		Calendar dataPrevisaoDevolucao = Calendar.getInstance();
		dataPrevisaoDevolucao.setTime(emprestimo.getDataEmprestimo());
		dataPrevisaoDevolucao.add(Calendar.DATE,5);
		//emprestimo.setDataPrevistaDevolucao(dataPrevisaoDevolucao.getTime());
		
		return dataPrevisaoDevolucao;
	}

	public List<Emprestimo> find(String filter) {
		// TODO Auto-generated method stub
		return persist.find(filter);
	}

	public Emprestimo devolver(Emprestimo emprestimo) {
		// TODO Auto-generated method stub
		Livro livro = livroNegocio.find("").get(emprestimo.getLivro().getId());
		livro.setEmprestado(false);
		return persist.devolver(emprestimo);
	}


}
