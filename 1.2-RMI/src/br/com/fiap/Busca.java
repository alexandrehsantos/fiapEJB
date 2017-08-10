package br.com.fiap;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author logonrm
 *
 */
public class Busca {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		//10.20.74.41
		while(true){
		Carrinho carrinho = (Carrinho)Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		Item item5 = new Item();
		
		item.setNome("-------");
		item.setPreco(10.02);
		carrinho.cadastrarItem(item);
		
		item.setNome("|||||||");
		item.setPreco(10.02);
		carrinho.cadastrarItem(item2);

		item.setNome("******");
		item.setPreco(10.02);
		carrinho.cadastrarItem(item3);

		item.setNome(":) :)");
		item.setPreco(10.02);
		carrinho.cadastrarItem(item4);

		item.setNome("!!!!!!!!");
		item.setPreco(10.02);
		carrinho.cadastrarItem(item5);

		}
		}

}
