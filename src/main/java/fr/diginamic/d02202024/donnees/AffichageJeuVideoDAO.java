package fr.diginamic.d02202024.donnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AffichageJeuVideoDAO {

    public static void afficherJeuxVideo() {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connexion = ConnexionBDD.getConnection();
            String sql = "SELECT * FROM jeux";
            preparedStatement = connexion.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String titre = resultSet.getString("titre");
                String plateforme = resultSet.getString("plateforme");
                String genre = resultSet.getString("genre");
                int anneeSortie = resultSet.getInt("annee_sortie");

                System.out.println("Titre: " + titre + ", Plateforme: " + plateforme + ", Genre: " + genre + ", Année de sortie: " + anneeSortie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            // (omis pour des raisons de concision)
        }
    }
}
