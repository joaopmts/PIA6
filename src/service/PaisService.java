package service;

import model.Pais;

import java.util.ArrayList;

import dao.PaisDAO;


public class PaisService {
	PaisDAO dao = new PaisDAO();
	Pais pais = new Pais();
	
	public int criar(Pais cliente) {
		return dao.criar(cliente);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Pais carregar(int id){
		return dao.carregar(id);
	}
	
	public String maiorpopulacao() {
		return dao.maiorpopulacao();
	}
	
	public String menorarea() {
		return dao.MenorArea();
	}
	
	public ArrayList<Pais> listarTodos() {
		return dao.listarTodos();
		
	}
	

}