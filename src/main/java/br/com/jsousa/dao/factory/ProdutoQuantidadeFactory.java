/**
 * 
 */
package br.com.jsousa.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.jsousa.domain.Produto;
import br.com.jsousa.domain.ProdutoQuantidade;

/**
 * @author jovane.sousa
 *
 */
public class ProdutoQuantidadeFactory {

	public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
		Produto prod = ProdutoFactory.convert(rs);
		ProdutoQuantidade prodQ = new ProdutoQuantidade();
		prodQ.setProduto(prod);
		prodQ.setId(rs.getLong("ID"));
		prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
		prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		return prodQ;
	}
}
