/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.UsuarioClienteEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class UsuarioClienteDAO extends DAOGenerico<UsuarioClienteEntidade, Long>{

	public UsuarioClienteDAO(Session sessao) {
		super(sessao);
	}
	
}
