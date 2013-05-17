/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.MotoristaDAO;
import br.com.vanmais.bancodedados.entidade.MotoristaEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class MotoristaBo {
	
	private MotoristaDAO dao;
	private Session sessao;
	
	public List<MotoristaEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new MotoristaDAO(sessao);
		List<MotoristaEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public MotoristaEntidade 
	
}
