package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.AdminBean;
import model.ClienteBean;
import model.DipendenteBean;
import model.UtenteBean;;

public class UtenteDao {
	
	
	/// AGGIUNGI
	public UtenteBean aggiungiUtente(String nome, String cognome, String username, String password, char ruolo){
			
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
		
		UtenteBean u = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			u = new UtenteBean(nome, cognome, username, password, ruolo);
			session.persist(u);
				
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return u;			
	}
		
		
		
		/// LEGGI DA NOME E COGNOME
		public UtenteBean leggiUtenteDaNome(String nome, String cognome){
			
			Session session = HibernateUtil.openSession();		
			Transaction tx = null;
		
			UtenteBean u = null;					
				
			try {
					
				tx = session.getTransaction();
					
				tx.begin(); 			
					
				Query query=session.createQuery("from UtenteBean where nome=:nome AND cognome=:cognome");
				query.setString("nome", nome);
				query.setString("cognome", cognome);
				
				u = (UtenteBean) query.uniqueResult();
					
				tx.commit();	
					
			} catch (Exception ex){
				tx.rollback();
			} finally {
				session.close();
			}				
		
			return u;			
		}
		
		
		/// LEGGI UTENTE DA USERNAME
		public UtenteBean leggiUtenteDaUsername(String username){
			
			Session session = HibernateUtil.openSession();		
			Transaction tx = null;
			
			UtenteBean u = null;
			
			try {
				
				tx = session.getTransaction();
					
				tx.begin(); 			
					
				Query query=session.createQuery("from UtenteBean where username=:username");
				query.setString("username", username);
				
				u = (UtenteBean) query.uniqueResult();
					
				tx.commit();	
					
			} catch (Exception ex){
				tx.rollback();
			} finally {
				session.close();
			}	
			
			return u;			
		}
		
		
		
		/// MODIFICA
		
		
		
		/// ELIMINA
}
