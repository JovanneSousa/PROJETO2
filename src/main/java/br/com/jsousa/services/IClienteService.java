/**
 * 
 */
package br.com.jsousa.services;

import br.com.jsousa.domain.Cliente;
import br.com.jsousa.exceptions.DAOException;
import br.com.jsousa.exceptions.TipoChaveNaoEncontradaException;
import br.com.jsousa.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
