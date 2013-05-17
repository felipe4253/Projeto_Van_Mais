/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.TurnoItinerarioDAO;
import br.com.vanmais.bancodedados.entidade.TurnoItinerarioEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class TurnoItinerarioBo {
	private TurnoItinerarioDAO dao;
	private Session sessao;
	
	public List<TurnoItinerarioEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new TurnoItinerarioDAO(sessao);
		List<TurnoItinerarioEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public TurnoItinerarioEntidade buscarPorId(Long id){
		return dao.buscarPeloId(id);
	}
}
