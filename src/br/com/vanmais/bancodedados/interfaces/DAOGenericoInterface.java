/**
 * 
 */
package br.com.vanmais.bancodedados.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public interface DAOGenericoInterface <T, ID extends Serializable> {
	
	
	List<T> buscarTodos();
	
	ID salvar(T obj);
	
	void atualizar (T obj);
	
	T buscarPeloId(ID id);

	void excluir(T obj);
	

}
