/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.BairroDAO;
import br.com.vanmais.bancodedados.dao.TipoInstituicaoDAO;
import br.com.vanmais.bancodedados.entidade.BairroEntidade;
import br.com.vanmais.bancodedados.entidade.TipoInstituicaoEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class TipoInstituicaoboBo {
	private TipoInstituicaoDAO dao;
	private Session sessao;
	
	public List<TipoInstituicaoEntidade> buscarTodos(){
		sessao = HibernateUtil.getSession(sessao);
		dao = new TipoInstituicaoDAO(sessao);
		List<TipoInstituicaoEntidade> lista = dao.buscarTodos();
		return lista;
	}
	
	public TipoInstituicaoEntidade buscarPorId(Long id){
		return dao.buscarPeloId(id);
	}
}
