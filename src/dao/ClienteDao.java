package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.ClienteBean;
import model.UtenteBean;

public class ClienteDao {

	/// AGGIUNGI
	public ClienteBean aggiungiClienteBean(String nome, String cognome, String username, String password, String ragioneSociale, String partitaIVA){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		ClienteBean c = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			c = new ClienteBean();
			c.setNome(nome);
			c.setCognome(cognome);
			c.setUsername(username);
			c.setPassword(password);
			c.setRagioneSociale(ragioneSociale);
			c.setPartitaIVA(partitaIVA);
			c.setRuolo('C');
			session.persist(c);
				
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return c;
	}
	
	/// LEGGI DA NOME
	public ClienteBean trovaClienteDaNome(String nome, String cognome){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		ClienteBean c = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			Query query = session.createQuery("from ClienteBean where nome=:nome AND cognome=:cognome");
			query.setString("nome", nome);
			query.setString("cognome", cognome);
				
			c = (ClienteBean) query.uniqueResult();
			
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return c;
	}
	
	
	
	/// LEGGI DA USERNAME
	public ClienteBean trovaClienteDaUsername(String username){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		ClienteBean c = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			Query query = session.createQuery("from ClienteBean where username=:username");
			query.setString("username", username);
				
			c = (ClienteBean) query.uniqueResult();
			
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return c;
	}
	
	/// MODIFICA
	
	
	/// ELIMINA
}
