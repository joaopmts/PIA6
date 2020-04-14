package model;

import java.io.Serializable;


public class Pais implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String nome,maiorPop, menorArea;
	long populacao;
	double area;
	
	public Pais()
	{}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public double getArea() {
		return area;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getMaiorPop() {
		return maiorPop;
	}

	public String getMenorArea() {
		return menorArea;
	}

	public void setMaiorPop(String maiorpop) {
		this.maiorPop = maiorpop;
	}

	public void setMenorArea(String menorarea) {
		this.menorArea = menorarea;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao
				+ ", area=" + area + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (populacao == 0) {
			if (other.populacao != 0)
				return false;
		} else if (!(populacao == other.populacao))
			return false;
		if (area == 0) {
			if (other.area != 0)
				return false;
		} else if (!(area == other.area))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

}
