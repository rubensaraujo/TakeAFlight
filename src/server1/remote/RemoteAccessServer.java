package server1.remote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import client.remote.RemoteAccessClient;
import server1.controller.ListaVoosController;

public class RemoteAccessServer extends UnicastRemoteObject implements RemoteAccessClient {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	ListaVoosController listaVoos = new ListaVoosController();
	
	protected RemoteAccessServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try {
			RemoteAccessServer servidor = new RemoteAccessServer();
			String host = "//localhost/RemoteAccessClient";
			Naming.bind(host, servidor);
		} catch (RemoteException ex) {
			System.out.println("Erro: " + ex.getMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void buscarVoos() throws RemoteException{
		// TODO Auto-generated method stub
		listaVoos.consultarVoosDB();
	}

	@Override
	public void reservarVoo() throws RemoteException{
		// TODO Auto-generated method stub
		
	}

}
