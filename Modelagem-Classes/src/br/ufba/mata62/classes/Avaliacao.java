package br.ufba.mata62.classes;

import java.util.Date;

public class Avaliacao {
	private Discente aluno;
	private Trabalho trabalho;
	private Date dataLimite;
	private FormularioAvaliacao formularioAvaliacao;
	
	public Discente getAluno() {
		return aluno;
	}
	public Avaliacao setAluno(Discente aluno) {
		this.aluno = aluno;
		return this;
	}
	public Trabalho getTrabalho() {
		return trabalho;
	}
	public Avaliacao setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
		return this;
	}
	public Date getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}
	public FormularioAvaliacao getFormularioAvaliacao() {
		return formularioAvaliacao;
	}
	public void setFormularioAvaliacao(FormularioAvaliacao formularioAvaliacao) {
		this.formularioAvaliacao = formularioAvaliacao;
	}
	
	
}