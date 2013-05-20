/**
 * 
 */
package br.com.vanmais.facade;

import java.util.List;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.dao.MotoristaDAO;
import br.com.vanmais.bancodedados.entidade.MotoristaEntidade;
import br.com.vanmais.bancodedados.util.HibernateUtil;
import br.com.vanmais.facade.exception.MotoristaExistenteException;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 * 
 */
public class MotoristaBo {

	private MotoristaDAO dao;
	private Session sessao;

	public List<MotoristaEntidade> buscarTodos() {
		sessao = HibernateUtil.getSession(sessao);
		dao = new MotoristaDAO(sessao);
		List<MotoristaEntidade> lista = dao.buscarTodos();
		return lista;
	}

	public Long criar(MotoristaEntidade motorista)
			throws MotoristaExistenteException {

		sessao = HibernateUtil.getSession(sessao);
		dao = new MotoristaDAO(sessao);
		List<MotoristaEntidade> motoristas = dao.buscarTodos();

		// Verifica se existe algum motorista com os dados passados
		for (MotoristaEntidade entidade : motoristas) {
			if (motorista.getCpf() == entidade.getCpf()) {
				throw new MotoristaExistenteException();
			}

			if (motorista.getEmailMotorista().equals(
					entidade.getEmailMotorista())) {
				throw new MotoristaExistenteException();
			}
		}

		return dao.salvar(motorista);
	}

}
