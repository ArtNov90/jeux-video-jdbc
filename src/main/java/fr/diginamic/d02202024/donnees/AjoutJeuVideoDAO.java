package fr.diginamic.d02202024.donnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AjoutJeuVideoDAO {

    public static void ajouterJeuVideo(String titre, String plateforme, String genre, int anneeSortie) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = ConnexionBDD.getConnection();
            String sql = "INSERT INTO jeux (titre, plateforme, genre, annee_sortie) VALUES (?, ?, ?, ?)";
            preparedStatement = connexion.prepareStatement(sql);
            preparedStatement.setString(1, titre);
            preparedStatement.setString(2, plateforme);
            preparedStatement.setString(3, genre);
            preparedStatement.setInt(4, anneeSortie);

            int lignesAjoutees = preparedStatement.executeUpdate();
            System.out.println(lignesAjoutees + " ligne(s) ajoutée(s) avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            // (omis pour des raisons de concision)
        }
    }
}
