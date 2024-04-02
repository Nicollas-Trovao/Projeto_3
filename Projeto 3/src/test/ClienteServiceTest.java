package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Principal.DAO.IClienteDAO;
import main.Principal.domain.Cliente;
import main.Principal.exceptions.DAOException;
import main.Principal.exceptions.TipoChaveNaoEncontradaException;
import main.Principal.services.ClienteService;
import main.Principal.services.IClienteService;
import test.DAO.ClienteDaoMock;



public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Nicollas");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setLocalizacao("SP, BRASIL");
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Nicollas Trovão");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Nicollas Trovão", cliente.getNome());
	}
}