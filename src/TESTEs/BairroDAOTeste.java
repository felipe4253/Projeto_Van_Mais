/**
 * 
 */
package TESTEs;

import java.util.List;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import br.com.vanmais.bancodedados.dao.BairroDAO;
import br.com.vanmais.bancodedados.entidade.BairroEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class BairroDAOTeste {
	
	
	@Test
	public void testarBuscaDeBairrosPorRegiao(){
		
		Long codRegiao = 6L;
		
		Session sessao = null;
		sessao = HibernateUtil.getSession(sessao);
		BairroDAO dao = new BairroDAO(sessao);
		
		List<BairroEntidade> resultado = null;
		resultado = dao.buscarBairrosPorRegiao(codRegiao);
		
		Assert.assertNotNull(resultado);
		
		
	}
}
