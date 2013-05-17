/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.CidadeDAO;
import br.com.vanmais.bancodedados.entidade.CidadeEntidade;
import br.com.vanmais.bancodedados.entidade.MarcaVeiculoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class CidadeBo {
	
	private CidadeDAO dao;
	private Session sessao;
	
	public List<CidadeEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new CidadeDAO(sessao);
		List<CidadeEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public CidadeEntidade buscarPorId(Long id){
		sessao = HibernateUtil.getSession(sessao);
		dao = new CidadeDAO(sessao);
		return dao.buscarPeloId(id);
		
	}
}
