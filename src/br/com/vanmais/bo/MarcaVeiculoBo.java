/**
 * 
 */
package br.com.vanmais.bo;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
	private Transaction transacao;
	
	public void salvar(MarcaVeiculoEntidade mv){
		
		sessao = HibernateUtil.getSession(sessao);
		transacao.begin();
		
		dao = new MarcaVeiculoDAO(sessao);
		dao.salvar(mv);
		
		transacao.commit();
		sessao.close();
	}
}
