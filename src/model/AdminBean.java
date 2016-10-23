package model;

import javax.persistence.Entity;

@Entity
public class AdminBean extends UtenteBean{

	public AdminBean(){
		this.setNome("");
		this.setCognome("");
		this.setUsername("");
		this.setPassword("");
	}
	
	public AdminBean(String nome, String cognome,
			String username, String password){
		this.setNome(nome);
		this.setCognome(cognome);
		this.setUsername(username);
		this.setPassword(password);
	}
}
