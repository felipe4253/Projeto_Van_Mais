/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.MarcaVeiculoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class MarcaVeiculoDAO extends DAOGenerico<MarcaVeiculoEntidade, Long> {
	
	public MarcaVeiculoDAO(Session sessao){
		super(sessao); 
	}
	
	public void teste(){
		System.out.println("Teste");
	}
}
