package br.com.fiap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho{

	private List<Item> itens = new ArrayList();

	protected CarrinhoBean() throws RemoteException {
		super();
	}

	public void cadastrarItem(Item item) throws RemoteException {
		itens.add(item);
		System.out.println("Item cadastrado com sucesso: " + item.getNome());
	}

	@Override
	public List<Item> obterMedicamentos() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int obterQuantidadeItens() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removerCadastro(int matricula) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
