package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.ClienteBean;
import model.DipendenteBean;

public class DipendenteDao {

	
	/// AGGIUNGI DIPENDENTE
	public DipendenteBean aggiungiDipendenteBean(String nome, String cognome, String username, String password, double stipendio, String posizione){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		DipendenteBean d = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 		
			d = new DipendenteBean();
			d.setNome(nome);
			d.setCognome(cognome);
			d.setUsername(username);
			d.setPassword(password);
			d.setStipendio(stipendio);
			d.setPosizione(posizione);
			d.setRuolo('D');
			session.persist(d);
				
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return d;
	}
	
	
	
	/// LEGGI DIPENDENTE DA NOME E COGNOME
	public DipendenteBean trovaDipendenteDaNome(String nome, String cognome){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		DipendenteBean d = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			Query query = session.createQuery("from DipendenteBean where nome=:nome AND cognome=:cognome");
			query.setString("nome", nome);
			query.setString("cognome", cognome);
				
			d = (DipendenteBean) query.uniqueResult();
			
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return d;
	}
	
	
	
	/// LEGGI DIPENDENTE DA USERNAME
	public DipendenteBean trovaDipendenteDaUsername(String username){
		
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
	
		DipendenteBean d = null;					
			
		try {
				
			tx = session.getTransaction();
				
			tx.begin(); 			
				
			Query query = session.createQuery("from DipendenteBean where username=:username");
			query.setString("username", username);
				
			d = (DipendenteBean) query.uniqueResult();
			
			tx.commit();	
				
		} catch (Exception ex){
			tx.rollback();
		} finally {
			session.close();
		}				
		
		return d;
	}
	
	
	
	
	
}
