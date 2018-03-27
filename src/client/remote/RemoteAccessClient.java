package client.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteAccessClient extends Remote{
	public void buscarVoos() throws RemoteException;
	public void reservarVoo() throws RemoteException;
}
