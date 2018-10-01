package br.edu.up.arquitetura.biblioteca.model.dominio;

public class Livro {

	private int id;
	private String titulo;
	private Integer pagina;
	private String resumo;
	private Autor autor;
	private boolean emprestado;
	
	public Livro(){
		
	}
	
	public Livro(String titulo, Integer pagina, String resumo, Autor autor, boolean emprestado){
		this.titulo = titulo;
		this.pagina = pagina;
		this.resumo = resumo;
		this.autor = autor;
		this.emprestado = emprestado;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	
	
}
