package model;

import javax.persistence.Entity;

@Entity
public class ClienteBean extends UtenteBean {

	private String ragioneSociale;
	private String partitaIVA;
	
	
	/// GETTERS AND SETTERS
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	
	
	//// COSTRUTTORI
	public ClienteBean(String nome, String cognome,
			String username, String password, char ruolo,
			String ragioneSociale, String partitaIVA) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setUsername(username);
		this.setPassword(password);
		this.setRuolo(ruolo);
		this.ragioneSociale = ragioneSociale;
		this.partitaIVA = partitaIVA;
	}
	
	
	public ClienteBean(String nome, String cognome,
			String username, String password, char ruolo){
		this.setNome(nome);
		this.setCognome(cognome);
		this.setUsername(username);
		this.setPassword(password);
		this.setRuolo(ruolo);
	}
	
	public ClienteBean(){
		this.setNome("");
		this.setCognome("");
		this.setUsername("");
		this.setPassword("");
		this.setRuolo(' ');
		this.ragioneSociale = "";
		this.partitaIVA = "";		
	}
	
	
	@Override
	public String toString() {
		return "ClienteBean " + getNome() + " " + getCognome() + "  - username: " + getUsername() + "[ragioneSociale=" + ragioneSociale
				+ ", partitaIVA=" + partitaIVA + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
