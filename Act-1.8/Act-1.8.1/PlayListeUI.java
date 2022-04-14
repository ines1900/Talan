package ProjetMusique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayListeUI {
	public static void main(String[] args) {
		MusiqueImpl musique1 = new MusiqueImpl("tit1", "aut1", "interprete1", "genre1");
		MusiqueImpl musique2 = new MusiqueImpl("tit2", "aut2", "interprete2", "genre2");
		MusiqueImpl musique3 = new MusiqueImpl("tit3", "aut3", "interprete3", "genre3");
		MusiqueImpl musique4 = new MusiqueImpl("tit4", "aut4", "interprete4", "genre4");
		MusiqueImpl musique5 = new MusiqueImpl("tit5", "aut5", "interprete5", "genre5");
		MusiqueImpl musique6 = new MusiqueImpl("tit6", "aut6", "interprete6", "genre6");
		ArrayList<MusiqueImpl> array = null;
		PlayListeImpl playListe = new PlayListeImpl("nom1", "genre1", 6, array);
		System.out.println(playListe.ajouterMusique(playListe, musique1));
		System.out.println(playListe.ajouterMusique(playListe, musique2));
		System.out.println(playListe.ajouterMusique(playListe, musique3));
		System.out.println(playListe.ajouterMusique(playListe, musique4));
		System.out.println(playListe.ajouterMusique(playListe, musique5));
		System.out.println(playListe.ajouterMusique(playListe, musique6));
		System.out.println(playListe.afficherMusiques(playListe));
		PlayListeImpl playListe1 = new PlayListeImpl("nom2", "genre2", 6, array);
		System.out.println(playListe1.ajouterMusique(playListe1, musique1));
		System.out.println(playListe1.ajouterMusique(playListe1, musique2));
		System.out.println(playListe1.ajouterMusique(playListe1, musique3));
		System.out.println(playListe1.ajouterMusique(playListe1, musique4));
		System.out.println(playListe1.ajouterMusique(playListe1, musique5));
		System.out.println(playListe1.ajouterMusique(playListe1, musique6));
		System.out.println(playListe1.afficherMusiques(playListe1));
		ArrayList<PlayListeImpl> arrayPlayListe = new ArrayList<PlayListeImpl>();
		arrayPlayListe.add(playListe);
		arrayPlayListe.add(playListe1);
	
		// Affichage playliste dans l'ordre décroissant
		Collections.sort(arrayPlayListe, PlayListeUI.ComparatorNomDecroissant);
		System.out.println("Afficage de la play liste par nom dans l'ordre décroissant \n");
		for (PlayListeImpl playListeImpl : arrayPlayListe) {
			System.out.println(playListeImpl.getNom() + " ");
		}
		
		// Affichage playliste dans l'ordre croissant
		Collections.sort(arrayPlayListe, PlayListeUI.ComparatorNomCroissant);
		System.out.println("Afficage de la play liste par nom dans l'ordre croissant \n");
		for (PlayListeImpl playListeImpl : arrayPlayListe) {
			System.out.println(playListeImpl.getNom() + " ");
		}
	
		User user = new User("Hedi", "Maazoun", "Hadhoud", arrayPlayListe);
		System.out.println("L'utilisateur " + user.getNom() + " " + user.getPrenom()
				+ " a ses playlistes suivantes avec chacune ses musiques ");
		for (PlayListeImpl playListeImpl : arrayPlayListe) {
			System.out.println("* Play liste : " + playListeImpl.getNom() + " " + playListeImpl.getGenre()
					+ " avec ses musiques suivantes : ");
			ArrayList<MusiqueImpl> arrayMusiques = playListeImpl.getArray();
			for (MusiqueImpl musiqueImpl : arrayMusiques) {
				System.out.println("     - Musique : " + musiqueImpl.getTitre() + " de l'auteur : " + musiqueImpl.getAutheur());
			}
		}

	}

	private MusiqueImpl rechercherMusiqueParTitre(ArrayList<MusiqueImpl> array, String titre) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(titre)) {
				return musiqueImpl;
			}
		}
		return null;
	}

	private MusiqueImpl rechercherMusiqueParAuteur(ArrayList<MusiqueImpl> array, String auteur) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(auteur)) {
				return musiqueImpl;
			}
		}
	
		return null;
	}
	
	private MusiqueImpl SupprimerMusique(ArrayList<MusiqueImpl> array, String Musique1) {
			for(MusiqueImpl m: array) {
			if(m.getTitre().equals(Musique1)) {
				array.remove(m);
			break;
			}
		}
			return null;
	}

	/*
	 * Comparator pour le tri des musiques par nom croissant
	 */
	public static Comparator<PlayListeImpl> ComparatorNomCroissant = new Comparator<PlayListeImpl>() {

		@Override
		public int compare(PlayListeImpl e1, PlayListeImpl e2) {
			return e1.getNom().compareTo(e2.getNom());
		}
	};

	/*
	 * Comparator pour le tri des musiques par nom décroissant
	 */
	public static Comparator<PlayListeImpl> ComparatorNomDecroissant = new Comparator<PlayListeImpl>() {

		@Override
		public int compare(PlayListeImpl e1, PlayListeImpl e2) {
			return e2.getNom().compareTo(e1.getNom());
		}
	};
}
