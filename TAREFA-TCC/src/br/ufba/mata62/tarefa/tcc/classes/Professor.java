package br.ufba.mata62.tarefa.tcc.classes;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private static List<Professor> professores = new ArrayList<Professor>();
	private static int _ID = 0;
	
	private int codigo;
	private String nome;
	private List<Area> areas = new ArrayList<Area>();
	
	public Professor(String nome) {
		this.codigo = ++_ID;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public String getPerfil() {
		return "";
	}
	
	public static List<Professor> obterPorAreaInteresse(Area areaInteresse) {
		List<Professor> found = new ArrayList<Professor>();
		for (Professor professor : professores) {
			if(professor.getAreas().equals(areaInteresse))
				found.add(professor);
		}
		return found;
	}
}
