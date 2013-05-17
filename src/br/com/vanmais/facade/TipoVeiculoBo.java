/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.TipoVeiculoDAO;
import br.com.vanmais.bancodedados.entidade.TipoVeiculoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class TipoVeiculoBo {
	
	private TipoVeiculoDAO dao;
	private Session sessao;
	
	public List<TipoVeiculoEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new TipoVeiculoDAO(sessao);
		List<TipoVeiculoEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public TipoVeiculoEntidade buscarPorId(Long id){
		return dao.buscarPeloId(id);
	}
}
