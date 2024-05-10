package fr.diginamic.d02202024.donnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JeuVideoDAO {

	// Méthode pour ajouter un nouveau jeu vidéo à la base de données
	public static void ajouterJeuVideo(String titre, String plateforme, String genre, int anneeSortie) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

		try {
			// Obtention d'une connexion à la base de données en utilisant la classe
			// ConnexionBDD
			connexion = ConnexionBDD.getConnection();
			// Requête SQL pour insérer un nouveau jeu vidéo dans la base de données
			String sql = "INSERT INTO jeux (titre, plateforme, genre, annee_sortie) VALUES (?, ?, ?, ?)";
			preparedStatement = connexion.prepareStatement(sql);
			preparedStatement.setString(1, titre);
			preparedStatement.setString(2, plateforme);
			preparedStatement.setString(3, genre);
			preparedStatement.setInt(4, anneeSortie);

			// Exécution de la requête d'insertion
			int lignesAjoutees = preparedStatement.executeUpdate();
			System.out.println(lignesAjoutees + " ligne(s) ajoutée(s) avec succès.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
