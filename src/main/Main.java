package main;

import java.util.List;

import model.dao.AutomovelDAO;
import model.entity.Automovel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Automovel auto = new Automovel();
		auto.setAnoFabricacao(2010);
		auto.setModelo("Ferrari");
		auto.setObservacoes("Nunca foi batido");*/
		
		List<Automovel> autos = new AutomovelDAO().listaAutos();
		for(Automovel auto:autos){
			System.out.println(auto.getModelo());
		}

	}

}
