package ProjetMusique;

import java.util.ArrayList;

public class User {
	private String nom;
	private String prenom;
	private String pseudo;
	private ArrayList<PlayListeImpl> array;
	public User(String nom, String prenom, String pseudo, ArrayList<PlayListeImpl> array) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.array = array;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public ArrayList<PlayListeImpl> getArray() {
		return array;
	}
	public void setArray(ArrayList<PlayListeImpl> array) {
		this.array = array;
	}
	
	

}
