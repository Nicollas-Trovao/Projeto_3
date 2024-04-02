package main.Principal.DAO;

import main.Principal.DAO.Generic.IGenericDAO;
import main.Principal.domain.Venda;
import main.Principal.exceptions.DAOException;
import main.Principal.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}