/**
 * 
 */
package br.com.vanmais.bancodedados.util.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import br.com.vanmais.bancodedados.interfaces.DAOGenericoInterface;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public abstract class DAOGenerico <T, ID extends Serializable> implements DAOGenericoInterface<T, ID>{
	
	private final Logger logger = Logger.getLogger(this.getClass());
	private final Class<T> classeDePersistencia;
	private Session sessao;
	
	@SuppressWarnings("unchecked")
	public DAOGenerico(Session sessao){
		this.sessao = sessao;
		this.classeDePersistencia = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T buscarPeloId(ID id){
		return (T) getSessao().load(getClasseDePersistencia(), id);
		
	}
	
	@Override
	public List<T> buscarTodos(){
		return buscarPorCriterio();
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public ID salvar(T obj){
		Serializable id = (ID) sessao.save(obj);
		return (ID) id;
	}
	
	@Override
	public void atualizar (T obj){
		getSessao().beginTransaction();
		getSessao().update(obj);
		getSessao().getTransaction().commit();
	}
	
	@Override
	public void excluir(T obj){
		getSessao().beginTransaction();
		getSessao().delete(obj);
		getSessao().getTransaction().commit();
		
	}
	
	public void setSession(Session session){
		this.sessao = session;
	}
	
	public Session getSessao(){
		if (this.sessao == null) {
			this.logger.error("Não foi possível encontrar uma sessão");
			throw new IllegalStateException("A sessão não foi setada no DAO antes do uso");
		}
		return this.sessao;
	}
	
	private Class<T> getClasseDePersistencia(){
		return this.classeDePersistencia;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> buscarPorCriterio(Criterion... criterio){
		Criteria crit = getSessao().createCriteria(getClasseDePersistencia());
		
		for(Criterion c : criterio){
			crit.add(c);
		}
		
		return crit.list();
	}
	
}
