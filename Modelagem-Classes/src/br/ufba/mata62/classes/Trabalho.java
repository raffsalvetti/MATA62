package br.ufba.mata62.classes;

import br.ufba.mata62.classes.papel.Orientado;
import br.ufba.mata62.classes.papel.Orientador;

public class Trabalho {
	private String titulo;
	private String caminhoPdf;
	private int semestre;
	private String areaInteresse;
	private EtapaProjeto etapaProjeto = EtapaProjeto.PROJETO_FINAL_1;
	private Orientador orientador;
	private Orientador coOrientador;
	private Orientado orientado;
	private Avaliacao avaliacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCaminhoPdf() {
		return caminhoPdf;
	}
	public void setCaminhoPdf(String caminhoPdf) {
		this.caminhoPdf = caminhoPdf;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getAreaInteresse() {
		return areaInteresse;
	}
	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}
	public EtapaProjeto getEtapaProjeto() {
		return etapaProjeto;
	}
	public void setEtapaProjeto(EtapaProjeto etapaProjeto) {
		this.etapaProjeto = etapaProjeto;
	}
	public Orientador getOrientador() {
		return orientador;
	}
	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}
	public Orientador getCoOrientador() {
		return coOrientador;
	}
	public void setCoOrientador(Orientador coOrientador) {
		this.coOrientador = coOrientador;
	}
	public Orientado getOrientado() {
		return orientado;
	}
	public void setOrientado(Orientado orientado) {
		this.orientado = orientado;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
