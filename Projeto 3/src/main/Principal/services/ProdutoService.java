package main.Principal.services;

import main.Principal.DAO.IProdutoDAO;
import main.Principal.domain.Produto;
import main.Principal.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}