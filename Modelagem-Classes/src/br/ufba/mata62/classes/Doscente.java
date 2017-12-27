package br.ufba.mata62.classes;

import java.util.ArrayList;
import java.util.List;

public class Doscente {
	private String nome;
	private String foto;
	private List<Contato> contatos = new ArrayList<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
