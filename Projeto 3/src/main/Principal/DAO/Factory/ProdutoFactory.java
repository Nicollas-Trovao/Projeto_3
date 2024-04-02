package main.Principal.DAO.Factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.Principal.domain.Produto;



public class ProdutoFactory {

	
	public static Produto convert(ResultSet rs) throws SQLException {
		Produto prod = new Produto();
		prod.setId(rs.getLong("ID_PRODUTO"));
		prod.setCodigo(rs.getString("CODIGO"));
		prod.setNome(rs.getString("NOME"));
		prod.setDescricao(rs.getString("DESCRICAO"));
		prod.setValor(rs.getBigDecimal("VALOR"));
		prod.setTamanho(rs.getBigDecimal("TAMANHO"));
		return prod;
	}
}