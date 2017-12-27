package br.ufba.mata62.classes;

import java.util.Date;

public class Avaliacao {
	private Date dataLimite;
	private FormularioAvaliacao formularioAvaliacao;
	
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
