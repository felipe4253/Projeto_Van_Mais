/**
 * 
 */
package br.com.vanmais.bancodedados.util;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class GerenciamentoBD {
	
	private final String advertencia = "A execu�ao deste m�todo faz parte da configura��o do ambiente de desenvolvimento do Projeto"+
	" Van +.\n Ao clicar em 'sim' abaixo, o sistema tentar� criar uma conex�o com o banco de dados para gerar o schema descrito nas configura��es"+
	"\ndo projeto. Antes de executar este m�todo, certifique-se de que n�o h� tabelas deste schema previamente criadas e populadas no banco de dados, "+
	"\npois este procedimento ir� descartar os dados e sobrepor as tabelas.\n\n\tDeseja continuar?";
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Test
	public void criarTabelas(){
		
		if(JOptionPane.showConfirmDialog(null, advertencia) == 0){
			logger.info("Projeto Van Mais - Criando tabelas no banco de dados...");
			Configuration config = new Configuration();
			config.configure();
			new SchemaExport(config).create(true,true);
			logger.info("Projeto Van Mais - Tabelas criadas com sucesso!");
		}
	}
	
	//@Test
	public void excluirTabelas(){
		logger.info("Excluindo tabelas do banco de dados...");
		Configuration config = new Configuration();
		config.configure();
		new SchemaExport(config).drop(true,true);
		
	}
	
}
