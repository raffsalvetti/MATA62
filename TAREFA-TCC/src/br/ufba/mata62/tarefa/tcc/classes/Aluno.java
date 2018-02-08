package br.ufba.mata62.tarefa.tcc.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	private static int _ID = 0;
	
	private int codigo;
	private String nome;
	private String matricula;
	private List<Area> areas = new ArrayList<Area>();
	private Tcc tcc;
	
	public Aluno(String nome, String matricula) {
		this.codigo = ++_ID;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
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
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public Tcc getTcc() {
		return tcc;
	}
	public void setTcc(Tcc tcc) {
		this.tcc = tcc;
	}
}
