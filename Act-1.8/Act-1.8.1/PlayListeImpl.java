package ProjetMusique;

import java.util.ArrayList;

public class PlayListeImpl implements PlayListe {

	private final static int MAX_MUSIQUES = 5;
	private String nom;
	private String genre;
	private Integer nombreTitres;
	private ArrayList<MusiqueImpl> array;

	public PlayListeImpl(String nom, String genre, Integer nombreTitres, ArrayList<MusiqueImpl> array) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.nombreTitres = nombreTitres;
		this.array = array;
	}

	@Override
	public String afficherMusiques(PlayListeImpl playListe) {
		String music = "La liste des musiques est : \n";
		ArrayList<MusiqueImpl> array = playListe.getArray();
		for (MusiqueImpl musique : array) {
			music += musique.afficherMusique(musique) + "\n";
		}
		return music;
	}

	@Override
	public String ajouterMusique(PlayListeImpl playListe, MusiqueImpl musique) {
		ArrayList<MusiqueImpl> array = playListe.getArray();
		String msg;
		if(array == null) {
			array = new ArrayList<MusiqueImpl>();
			array.add(musique);
			playListe.setArray(array);
			msg = "Ajout musique " + musique.getTitre() + " OK ";
		}else {
			if(array.size() < MAX_MUSIQUES) {
				array.add(musique);
				playListe.setArray(array);
				msg = "Ajout musique " + musique.getTitre() + " OK ";
			} else {
				msg = "Ajout musique " + musique.getTitre() + " KO, nombre max de musique atteint";
			}
		}
		return msg;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getNombreTitres() {
		return nombreTitres;
	}

	public void setNombreTitres(Integer nombreTitres) {
		this.nombreTitres = nombreTitres;
	}

	public ArrayList<MusiqueImpl> getArray() {
		return array;
	}

	public void setArray(ArrayList<MusiqueImpl> array) {
		this.array = array;
	}

}
