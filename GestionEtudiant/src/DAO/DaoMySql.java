/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DaoMySql {
    private Connection conn=null;
    PreparedStatement ps=null;

    public PreparedStatement getPs() {
        return ps;
    }
    
    public void ouvrirConnexionBD(){
         try {
           //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //ouvrir la connexion
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant", "root", "");
           
        } catch (ClassNotFoundException ex) {
            System.out.println("Erreur du chargement de Driver");
        }catch (SQLException ex){
            System.out.println("Erreur d'ouverture de la base de données");
        } 
         
    }
    public void preparerRequete(String sql) {
        try {
            if(sql.toLowerCase().startsWith("insert")){
             
                 ps=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            }else{
                ps=conn.prepareStatement(sql);
            }
        } catch (SQLException ex) {
                Logger.getLogger(DaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public int executeMisAJour() {
        int nbreLigne=0;
        try {
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nbreLigne;
    }
   
    public ResultSet executeSelect(){
        ResultSet rs=null;
        try {
             rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
