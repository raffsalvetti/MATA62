package br.ufba.mata62.classes;

import java.util.Date;
import java.util.List;

import br.ufba.mata62.classes.papel.Estudante;

public class Aluno implements Estudante {
	private String nome;
	private String matricula;
	private Date ingresso;
	private Trabalho trabalho;
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
	public Trabalho getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}
	
	@Override
	public List<Orientando> getListaTrabalhosOrientados(boolean semestreCorrente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Trabalho> buscarAreaInteresseTrabalho(String areaInteresse) {
		// TODO Auto-generated method stub
		return null;
	}

}