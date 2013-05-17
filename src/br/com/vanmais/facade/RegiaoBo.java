/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.RegiaoDAO;
import br.com.vanmais.bancodedados.entidade.RegiaoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class RegiaoBo {
	
	private RegiaoDAO dao;
	private Session sessao;
	
	public List<RegiaoEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new RegiaoDAO(sessao);
		List<RegiaoEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public RegiaoEntidade buscarPorId(Long id){
		sessao = HibernateUtil.getSession(sessao);
		dao = new RegiaoDAO(sessao);
		return dao.buscarPeloId(id);
		
	}
}
