/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.TipoInstituicaoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class TipoInstituicaoDAO extends DAOGenerico<TipoInstituicaoEntidade, Long>{

	public TipoInstituicaoDAO(Session sessao) {
		super(sessao);
	}

}
