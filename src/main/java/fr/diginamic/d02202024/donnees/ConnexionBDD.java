package fr.diginamic.d02202024.donnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
    static final String URL = "jdbc:mysql://localhost:3306/jeux_video";
    static final String UTILISATEUR = "root";
    static final String MOT_DE_PASSE = ""; // Laissez vide si aucun mot de passe n'est défini

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
    }
}
