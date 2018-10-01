package br.edu.up.arquitetura.biblioteca.model.dominio;

public class Mutuario {

	
	private int id;
	private String nome;
	private Integer cpf;
	private String email;
	
	public Mutuario(){
		
	}
	
	public Mutuario(String nome, Integer cpf, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
