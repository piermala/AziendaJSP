package test;

import dao.AdminDao;
import model.AdminBean;
import model.ClienteBean;
import model.DipendenteBean;
import model.UtenteBean;
import services.Servizi;

public class MainClass {

	static Servizi serv;
	static AdminDao aDao;
	
	public static void main(String[] args) {
		
		serv = new Servizi();
		aDao = new AdminDao();
		
		/// AGGIUNGI ADMIN
		AdminBean admin = aDao.aggiungiAdmin("Capo", "Banda", "capobanda", "admin");
		System.out.println(admin);
		
		
		/// LEGGI UTENTE DA NOME E COGNOME
		UtenteBean u = serv.leggiUtenteDaNome("Capo", "Banda");
		System.out.println(u);
		if ( u != null) {
			System.out.println("UTENTE DA NOME E COGNOME: " + u);
		} else {
			System.out.println("L'UTENTE NON ESISTE!");
		}
		
		
		/// LEGGI UTENTE DA USERNAME
		UtenteBean u1 = serv.leggiUtenteDaUsername("capobanda");		
		if ( u1 != null) {
			System.out.println("UTENTE DA USERNAME: " + u1);
		} else {
			System.out.println("L'UTENTE NON ESISTE!");
		}
		
		
		/// AGGIUNGI CLIENTE
		ClienteBean c1 = serv.aggiungiClienteBean("Peppo", "Toco", "pep", "boschi", "falegname", "PTB64B18");
		System.out.println(c1);
		
		ClienteBean c2 = serv.aggiungiClienteBean("Mario", "Mori", "mori", "Marmori", "negoziante", "GFDEA8762L");
		System.out.println(c2);
		
		
		/// LEGGI CLIENTE DA NOME
		ClienteBean c3 = serv.leggiClienteDaNome("Peppo", "Toco");
		if (c3 != null){
			System.out.println("CLIENTE DA NOME: " + c3);
		} else {
			System.out.println("IL CLIENTE NON ESISTE!");
		}
		
		
		/// LEGGI CLIENTE DA USERNAME
		ClienteBean c4 = serv.leggiClienteDaUsername("mori");
		if (c4 != null){
			System.out.println("CLIENTE DA USERNAME: " + c4);
		} else {
			System.out.println("IL CLIENTE NON ESISTE!");
		}
		
		
		
		/// AGGIUNGI DIPENDENTE
		DipendenteBean d1 = serv.aggiungiDipendente("Carlo", "Nesti", "nesti", "sport", 3000.0, "Dirigente");
		System.out.println(d1);
		
		
		/// LEGGI UTENTE DA NOME E COGNOME
		DipendenteBean d2 = serv.trovaDipendenteDaNome("Carlo", "Nesti");
		if (d2 != null){
			System.out.println("DIPENDENTE DA NOME: " + d2);
		} else {
			System.out.println("IL DIPENDENTE CERCATO NON ESISTE!");
		}
		
		/// LEGGI UTENTE DA NOME E COGNOME
		DipendenteBean d3 = serv.trovaDipendenteDaUsername("nesti");
		if (d3 != null){
			System.out.println("DIPENDENTE DA USERNAME " + d3);
		} else {
			System.out.println("IL DIPENDENTE CERCATO NON ESISTE!");
		}
		
		
	}
	
}
