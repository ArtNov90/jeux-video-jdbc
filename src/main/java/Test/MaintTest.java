package Test;

import fr.diginamic.d02202024.donnees.JeuVideoDAO;

public class MaintTest {

	public static void main(String[] args) {
        // Appel de la méthode pour ajouter un nouveau jeu vidéo à la base de données
        JeuVideoDAO.ajouterJeuVideo("God of War Ragnarok", "Playstation 5", "Action/Aventure", 2023);
    }
}
