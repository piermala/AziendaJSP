package model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class UtenteBean implements Serializable {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUtente;
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private char ruolo;
	
	
	/// GETTERS AND SETTERS
	public int getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getRuolo() {
		return ruolo;
	}
	public void setRuolo(char ruolo) {
		this.ruolo = ruolo;
	}
	
	
	/// COSTRUTTORI
	public UtenteBean(String nome, String cognome,
			String username, String password, char ruolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}
	
	public UtenteBean(){
		
	}
	
	
	/// TO STRING
	@Override
	public String toString() {
		return "UtenteBean [idUtente=" + idUtente + ", nome=" + nome
				+ ", cognome=" + cognome + ", username=" + username
				+ ", password=" + password + ", ruolo=" + ruolo + "]";
	}
	
	
}
