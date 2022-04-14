package ProjetMusique;

public class MusiqueImpl implements Musique{

	private String titre;
	private String autheur;
	private String interprete;
	private String genre;
	
	public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
		super();
		this.titre = titre;
		this.autheur = autheur;
		this.interprete = interprete;
		this.genre = genre;
	}


	@Override
	public String afficherMusique(MusiqueImpl musique) {
		return musique.getTitre() + " , son autheur est : " + musique.getAutheur() + " d'interprete : "
				+ musique.getInterprete() + " de genre : " +musique.getGenre();
		
	}
	@Override
	public boolean comparerMusique(MusiqueImpl musique1, MusiqueImpl musique2) {
		boolean testComparateur = true;
		testComparateur = musique1.getTitre().equals(musique2.getTitre());
		testComparateur = testComparateur && musique1.getAutheur().equals(musique2.getAutheur());
		testComparateur = testComparateur && musique1.getInterprete().equals(musique2.getInterprete());
		testComparateur = testComparateur && musique1.getGenre().equals(musique2.getGenre());
		return testComparateur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAutheur() {
		return autheur;
	}


	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}


	public String getInterprete() {
		return interprete;
	}


	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
}
