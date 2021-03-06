package connectivity;

import java.sql.*;

public class InsertClass {

    public static void createAccount(String pseudo, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO utilisateur (pseudo,password) VALUES(?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, pseudo, Types.VARCHAR);
            prestate.setObject(2, password, Types.VARCHAR);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertUser(String pseudo, String password, Byte role) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO utilisateur (pseudo,password,role) VALUES(?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, pseudo, Types.VARCHAR);
            prestate.setObject(2, password, Types.VARCHAR);
            prestate.setObject(3, role, Types.TINYINT);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertMedical(String carteID, String secuNum, String nom, String prenom, Date age, String adresse, String telNum, String prescriptionNum, String examNum, String profession, String validite, String bilanRadio, String bilanBio) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO dossier_medical (idCarte,secuNum,nom,prenom,age,adresse,telNum,prescriptionNum,examNum,profession,validite,bilanRadio,bilanBio) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, carteID, Types.INTEGER);
            prestate.setObject(2, secuNum, Types.INTEGER);
            prestate.setObject(3, nom, Types.VARCHAR);
            prestate.setObject(4, prenom, Types.VARCHAR);
            prestate.setObject(5, age, Types.DATE);
            prestate.setObject(6, adresse, Types.VARCHAR);
            prestate.setObject(7, telNum, Types.INTEGER);
            prestate.setObject(8, prescriptionNum, Types.INTEGER);
            prestate.setObject(9, examNum, Types.INTEGER);
            prestate.setObject(10, profession, Types.VARCHAR);
            prestate.setObject(11, validite, Types.BOOLEAN);
            prestate.setObject(12, bilanRadio, Types.TINYINT);
            prestate.setObject(13, bilanBio, Types.TINYINT);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertAppointment(String name, String surname, String reason, Date date) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO rendez_vous (nomPatient, prenomPatient, raison, date) VALUES(?,?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, name, Types.VARCHAR);
            prestate.setObject(2, surname, Types.VARCHAR);
            prestate.setObject(3, reason, Types.VARCHAR);
            prestate.setObject(4, date, Types.DATE);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertPrescription(String medicName, String dose, Date period) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO ordonnance (medicNom, dose, periode) VALUES(?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, medicName, Types.VARCHAR);
            prestate.setObject(2, dose, Types.INTEGER);
            prestate.setObject(3, period, Types.DATE);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertCertifMedic(String name, String surname, Date period) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO certif_medical (nom, prenom, reposPeriode) VALUES(?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, name, Types.VARCHAR);
            prestate.setObject(2, surname, Types.VARCHAR);
            prestate.setObject(3, period, Types.DATE);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertCertifDispense(String name, String surname, Date period) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO certif_dispense (nom, prenom, dispensePeriode) VALUES(?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, name, Types.VARCHAR);
            prestate.setObject(2, surname, Types.VARCHAR);
            prestate.setObject(3, period, Types.DATE);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertCertifApptitude(String idCard, String name, String surname, Date birthDate, String confirmation) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO certif_apptitude (idCarte, nom, prenom, dateNaissance, confirmation) VALUES(?,?,?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, idCard, Types.INTEGER);
            prestate.setObject(2, name, Types.VARCHAR);
            prestate.setObject(3, surname, Types.VARCHAR);
            prestate.setObject(4, birthDate, Types.DATE);
            prestate.setObject(5, confirmation, Types.TINYINT);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertFiche(String name, String surname, Date birthDate, String secuNumber, String adress, String telNumber, String validity, String gender) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO fiche_medicale (secuNum ,nom, prenom, dateNaissance, adresse, telNum, validite, sexe) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, secuNumber, Types.INTEGER);
            prestate.setObject(2, name, Types.VARCHAR);
            prestate.setObject(3, surname, Types.VARCHAR);
            prestate.setObject(4, birthDate, Types.DATE);
            prestate.setObject(5, adress, Types.VARCHAR);
            prestate.setObject(6, telNumber, Types.INTEGER);
            prestate.setObject(7, validity, Types.TINYINT);
            prestate.setObject(8, gender, Types.TINYINT);

            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }


    public static void insertRecette(String nature) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO recette (nature) VALUES(?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, nature, Types.INTEGER);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void insertDepense(String achat, String loyer, String facture) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinet_medical", "root", "");
            String sql = "INSERT INTO recette (achat, loyer, facture) VALUES(?,?,?)";
            PreparedStatement prestate = connection.prepareStatement(sql);
            prestate.setObject(1, achat, Types.INTEGER);
            prestate.setObject(2, loyer, Types.INTEGER);
            prestate.setObject(3, facture, Types.INTEGER);
            prestate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}