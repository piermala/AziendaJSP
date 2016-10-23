package model;

import javax.persistence.Entity;

@Entity
public class DipendenteBean extends UtenteBean {

	private double stipendio;
	private String posizione;
	
	
	/// GETTERS AND SETTERS
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public String getPosizione() {
		return posizione;
	}
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}	
	
	/// COSTRUTTORI
	public DipendenteBean(int idUtente, String nome, String cognome,
			String username, String password, char ruolo, double stipendio,
			String posizione) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setUsername(username);
		this.setPassword(password);
		this.setRuolo(ruolo);
		this.stipendio = stipendio;
		this.posizione = posizione;
	}
	
	public DipendenteBean(){
		this.setNome("");
		this.setCognome("");
		this.setUsername("");
		this.setPassword("");
		this.setRuolo(' ');
		this.posizione = "";
		this.stipendio = 0.0;
	}
	public DipendenteBean(String nome, String cognome, String username,
			String password, char ruolo) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setUsername(username);
		this.setPassword(password);
		this.setRuolo(ruolo);		
	}
}
