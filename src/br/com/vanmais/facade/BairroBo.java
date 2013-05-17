/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.BairroDAO;
import br.com.vanmais.bancodedados.entidade.BairroEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class BairroBo {
	
	private BairroDAO dao;
	private Session sessao;
	
	public List<BairroEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new BairroDAO(sessao);
		List<BairroEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public List<BairroEntidade> buscarPorRegiao(Long codRegiao){
		sessao = HibernateUtil.getSession(sessao);
		dao = new BairroDAO(sessao);
		return dao.buscarBairrosPorRegiao(codRegiao);
		
	}
	
	public BairroEntidade buscarPorId(Long id){
		sessao = HibernateUtil.getSession(sessao);
		dao = new BairroDAO(sessao);
		return dao.buscarPeloId(id);
		
	}
}
