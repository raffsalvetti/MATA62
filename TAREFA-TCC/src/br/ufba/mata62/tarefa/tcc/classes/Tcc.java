package br.ufba.mata62.tarefa.tcc.classes;

import java.util.ArrayList;
import java.util.List;

public class Tcc {
	private static List<Tcc> tccs = new ArrayList<Tcc>();
	private static int _ID = 0;
	
	private int codigo;
	private String titulo;
	private int ano;
	private List<Area> areas = new ArrayList<Area>();
	private List<Professor> professores = new ArrayList<Professor>();
	
	public Tcc(String titulo, int ano) {
		this.codigo = ++_ID;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	public void adicionarProfessor(Professor p) {
		getProfessores().add(p);
	}
}
