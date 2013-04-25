package br.com.vanmais.bancodedados.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	private HibernateUtil(){
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static Session getSession(Session session){
		if(session == null) {
			new HibernateUtil();
			return sessionFactory.openSession();
		}
		return session;
	}
}
