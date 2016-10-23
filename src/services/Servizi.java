package services;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import dao.ClienteDao;
import dao.DipendenteDao;
import dao.UtenteDao;
import model.ClienteBean;
import model.DipendenteBean;
import model.UtenteBean;

public class Servizi {

	UtenteDao uDao = new UtenteDao();
	ClienteDao cDao = new ClienteDao();
	DipendenteDao dDao = new DipendenteDao();
	
	//// AGGIUNGI UTENTE
	public UtenteBean aggiungiUtente(String nome, String cognome, String username, String password, char ruolo){
		
		UtenteBean u = null;
		u = uDao.aggiungiUtente(nome, cognome, username, password, ruolo);		
		
		return u;		
	}
	
	
	/// LEGGI UTENTE DA NOME E COGNOME
	public UtenteBean leggiUtenteDaNome(String nome, String cognome){
		
		UtenteBean u = null;
		u = uDao.leggiUtenteDaNome(nome, cognome);
		
		return u;
	}
	
	
	/// LEGGI UTENTE DA USERNAME
	public UtenteBean leggiUtenteDaUsername(String username){
		
		UtenteBean u = null;
		u = uDao.leggiUtenteDaUsername(username);
		
		return u;
	}
	
	
	/// AGGIUNGI CLIENTE
	public ClienteBean aggiungiClienteBean(String nome, String cognome, String username, String password, String ragioneSociale, String partitaIVA){
		
		ClienteBean cliente = null;
		cliente = cDao.aggiungiClienteBean(nome, cognome, username, password, ragioneSociale, partitaIVA);
		
		return cliente;
	}
	
	
	/// LEGGI CLIENTE DA NOME E COGNOME
	public ClienteBean leggiClienteDaNome(String nome, String cognome){
		
		ClienteBean c = null;
		c = cDao.trovaClienteDaNome(nome, cognome);
				
		return c;		
	}
	
	
	
	/// LEGGI CLIENTE DA USERNAME
	public ClienteBean leggiClienteDaUsername(String username){
		
		ClienteBean c = null;
		c = cDao.trovaClienteDaUsername(username);
				
		return c;		
	}
	
	
	
	
	/// AGGIUNGI DIPENDENTE 
	public DipendenteBean aggiungiDipendente(String nome,String cognome, String username, String password, double stipendio, String posizione){
		
		DipendenteBean d = null;
		d = dDao.aggiungiDipendenteBean(nome,cognome,username,password,stipendio,posizione);
		
		return d;
	}
	
	
	/// LEGGI DIPENDENTE DA NOME E COGNOME
	public DipendenteBean trovaDipendenteDaNome(String nome, String cognome){
		
		DipendenteBean d = null;
		
		d = dDao.trovaDipendenteDaNome(nome, cognome);
		return d;
	}
	
	
	/// LEGGI DIPENDENTE DA USERNAME
	public DipendenteBean trovaDipendenteDaUsername(String username){
		
		DipendenteBean d = null;
		
		d = dDao.trovaDipendenteDaUsername(username);
		return d;
	}
	
	
}
