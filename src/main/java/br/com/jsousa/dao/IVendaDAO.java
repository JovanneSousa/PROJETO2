/**
 * 
 */
package br.com.jsousa.dao;

import br.com.jsousa.dao.generic.IGenericDAO;
import br.com.jsousa.domain.Venda;
import br.com.jsousa.exceptions.DAOException;
import br.com.jsousa.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
