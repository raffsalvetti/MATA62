package br.ufba.mata62.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Discente {
	private String nome;
	private String matricula;
	private Date ingresso;
	private String foto;
	private List<Contato> contatos = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getIngresso() {
		return ingresso;
	}
	public void setIngresso(Date ingresso) {
		this.ingresso = ingresso;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}