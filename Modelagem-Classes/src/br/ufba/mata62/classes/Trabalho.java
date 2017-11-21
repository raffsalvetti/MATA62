package br.ufba.mata62.classes;

public class Trabalho {
	private String titulo;
	private String caminhoPdf;
	private int semestre;
	private String areaInteresse;
	private EtapaProjeto etapaProjeto = EtapaProjeto.PROJETO_FINAL_1;
	
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
	
}
