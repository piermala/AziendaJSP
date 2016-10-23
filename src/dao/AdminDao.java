package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.AdminBean;
import model.UtenteBean;

public class AdminDao {

	Session session = HibernateUtil.openSession();
	
	Transaction tx = null;
	
	
	/// AGGIUNGI
	public AdminBean aggiungiAdmin(String nome, String cognome, String username, String password){
		
		AdminBean a = null;
		
		try {
			
			tx = session.getTransaction();
			
			tx.begin(); 			
			
			a = new AdminBean(nome, cognome, username, password);
			a.setRuolo('A');
			session.save(a);
			
			tx.commit();	
			
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		
		return a;
		
	}
	
	
	
	/// ELIMINA
	
	
	
	
	/// MODIFICA
	
	
	
	/// ELIMINA
}
