package br.edu.up.arquitetura.biblioteca.model.dominio;

import java.util.Date;

public class Emprestimo {
	
	private int id;
	private Date dataEmprestimo;
	private Date dataPrevistaDevolucao;
	private Date dataDevolucao; 
	private Livro livro;
	private Mutuario mutuario;
	
	public Emprestimo(){
		
	}
	
	public Emprestimo(Date dataEmprestimo,Date dataPrevistaDevolucao ,Date dataDevolucao , Livro livro, Mutuario mutuario){
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.dataDevolucao = dataDevolucao;
		this.livro = livro;
		this.mutuario = mutuario;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Mutuario getMutuario() {
		return mutuario;
	}

	public void setMutuario(Mutuario mutuario) {
		this.mutuario = mutuario;
	}
	
	

}
