/**
 * 
 */
package br.com.jsousa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author jovane.sousa
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
