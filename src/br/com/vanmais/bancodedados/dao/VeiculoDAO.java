/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.MotoristaEntidade;
import br.com.vanmais.bancodedados.entidade.VeiculoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class VeiculoDAO extends DAOGenerico<VeiculoEntidade, Long>
{

	public VeiculoDAO(Session sessao) {
		super(sessao);
	}
	
	public List<VeiculoEntidade> buscarPorMotorista(MotoristaEntidade motorista){
		String sql = "select ";
		getSessao().createSQLQuery(arg0)
	}
}
