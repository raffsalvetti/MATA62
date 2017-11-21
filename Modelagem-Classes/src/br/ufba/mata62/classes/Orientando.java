package br.ufba.mata62.classes;

public class Orientando extends Aluno {
	private OrientadorImpl orientador;
	private Trabalho trablho;

	public OrientadorImpl getOrientador() {
		return orientador;
	}

	public void setOrientador(OrientadorImpl orientador) {
		this.orientador = orientador;
	}

	public Trabalho getTrablho() {
		return trablho;
	}

	public void setTrablho(Trabalho trablho) {
		this.trablho = trablho;
	}
	
}
