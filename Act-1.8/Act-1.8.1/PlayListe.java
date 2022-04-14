package ProjetMusique;

public interface PlayListe {

	public String afficherMusiques(PlayListeImpl playListe);

	public String ajouterMusique(PlayListeImpl playListe, MusiqueImpl musique);

}
