package client.app;

import java.text.ParseException;

//import view.TelaBuscaVoos;
import client.view.TelaPrincipal;
//import view.TelaReservas;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		TelaPrincipal app = new TelaPrincipal();
		boolean exit = false;
		//TelaReservas reservas = new TelaReservas();
		//TelaBuscaVoos busca = new TelaBuscaVoos();
		
		while(exit != true){
			exit = app.tela();
			limpaTela();
		}
	}
	
	
	public static void limpaTela() {	 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nn\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	} 
}
