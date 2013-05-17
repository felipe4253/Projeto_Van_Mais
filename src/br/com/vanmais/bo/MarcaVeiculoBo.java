/**
 * 
 */
package br.com.vanmais.bo;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.MarcaVeiculoDAO;
import br.com.vanmais.bancodedados.entidade.MarcaVeiculoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */

public class MarcaVeiculoBo {
	
	private MarcaVeiculoDAO dao;
	private Session sessao;
	
	public List<MarcaVeiculoEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new MarcaVeiculoDAO(sessao);
		List<MarcaVeiculoEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
}
