/**
 * 
 */
package br.com.jsousa.services;

import br.com.jsousa.dao.IProdutoDAO;
import br.com.jsousa.domain.Produto;
import br.com.jsousa.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
