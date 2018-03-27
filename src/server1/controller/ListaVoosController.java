package server1.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import server1.dao.CompaniaAereaDao;
import server1.model.CompaniaAerea;
import server1.model.Voo;

public class ListaVoosController {
	CompaniaAerea companiaAerea = new CompaniaAerea();
	CompaniaAereaDao companiaAereaDao = new CompaniaAereaDao(); 
	List<Voo> voos = new ArrayList<Voo>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	public void consultarVoosDB() {
		voos = companiaAereaDao.getListaVoos();
		
	
		for(Voo c : voos) {
			  System.out.println("Origem: " + c.getOrigem());
			  System.out.println("Destino: " + c.getDestino());
			  System.out.println("Preço: R$ " + c.getPreco());
			  System.out.println("Data do Voo: " + sdf.format(c.getData_voo().getTime()));
			  System.out.println("Capacidade do voo: " + c.getCapacidade());
		}
	}
}
