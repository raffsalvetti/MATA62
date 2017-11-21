package br.ufba.mata62.classes;

import java.util.List;

import br.ufba.mata62.classes.papel.Orientado;

public class Orientando extends Discente implements Orientado {
	//List<Estudante> getListaTrabalhosOrientados(boolean semestreCorrente);
	
	private Professor orientador;
	private Trabalho trabalho;

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

//	@Override
//	public List<Estudante> getListaTrabalhosOrientados(boolean semestreCorrente) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Trabalho> buscarAreaInteresseTrabalho(String areaInteresse) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
