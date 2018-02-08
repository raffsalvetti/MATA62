package br.ufba.mata62.tarefa.tcc.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Area implements Comparable<Area> {
	private static List<Area> areas = new ArrayList<Area>();
	private static int _ID = 0;
	
	private int codigo;
	private String nome;
	private String descricao;
	
	public Area(String nome, String descricao){
		this.codigo = ++_ID;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static List<Area> obterEmOrdemAlfabetica() {
		List<Area> areasOrdenada = new ArrayList<Area>(areas);
		Collections.sort(areasOrdenada);
		return areasOrdenada;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		if (codigo != other.codigo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Area o) {
		return getNome().compareToIgnoreCase(o.getNome());
	}
}
