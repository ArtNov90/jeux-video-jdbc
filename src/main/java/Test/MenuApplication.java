package Test;

import java.util.Scanner;

import fr.diginamic.d02202024.donnees.AffichageJeuVideoDAO;
import fr.diginamic.d02202024.donnees.AjoutJeuVideoDAO;

public class MenuApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean quitter = false;

		while (!quitter) {
			// Affichage du menu
			System.out.println("Menu:");
			System.out.println("1. Afficher tous les jeux vidéo");
			System.out.println("2. Ajouter un nouveau jeu vidéo");
			System.out.println("3. Quitter");
			System.out.print("Votre choix: ");

			// Lecture du choix de l'utilisateur
			int choix = scanner.nextInt();

			// Traitement du choix de l'utilisateur
			switch (choix) {
			case 1:
				// Afficher tous les jeux vidéo
				AffichageJeuVideoDAO.afficherJeuxVideo();
				break;
			case 2:
				// Ajouter un nouveau jeu vidéo
				System.out.println("Saisissez les informations du nouveau jeu vidéo :");
				System.out.print("Titre: ");
				String titre = scanner.next();
				System.out.print("Plateforme: ");
				String plateforme = scanner.next();
				System.out.print("Genre: ");
				String genre = scanner.next();
				System.out.print("Année de sortie: ");
				int anneeSortie = scanner.nextInt();
				AjoutJeuVideoDAO.ajouterJeuVideo(titre, plateforme, genre, anneeSortie);
				break;

			case 3:
				// Quitter l'application
				quitter = true;
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Choix invalide. Veuillez saisir à nouveau.");
			}
		}

		// Fermeture du scanner
		scanner.close();
	}
}
