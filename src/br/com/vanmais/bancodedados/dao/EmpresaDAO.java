/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.EmpresaEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class EmpresaDAO extends DAOGenerico<EmpresaEntidade, Long>{

	public EmpresaDAO(Session sessao) {
		super(sessao);
	}

}
