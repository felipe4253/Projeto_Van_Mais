/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;

import br.com.vanmais.bancodedados.entidade.BairroEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class BairroDAO extends DAOGenerico<BairroEntidade, Long>{

	public BairroDAO(Session sessao) {
		super(sessao);
	}
	
	public List<BairroEntidade> buscarBairrosPorRegiao(Long codRegiao){
		Criteria busca = getSessao().createCriteria(BairroEntidade.class);
		busca.add(Expression.eq("regiao.codRegiao", codRegiao));
		return busca.list();
	}

}
