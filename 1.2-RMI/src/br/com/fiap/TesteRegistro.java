package br.com.fiap;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class TesteRegistro {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(8081);
		Naming.rebind("farmacia/carrinho", new CarrinhoBean());
		System.out.println("Executando...");
	}
}
