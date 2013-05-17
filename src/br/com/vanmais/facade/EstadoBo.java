/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.EstadoDAO;
import br.com.vanmais.bancodedados.entidade.EstadoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class EstadoBo {
	private EstadoDAO dao;
	private Session sessao;
	
	public List<EstadoEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new EstadoDAO(sessao);
		List<EstadoEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public EstadoEntidade buscarPorId(Long id){
		sessao = HibernateUtil.getSession(sessao);
		dao = new EstadoDAO(sessao);
		return dao.buscarPeloId(id);
		
	}
}
