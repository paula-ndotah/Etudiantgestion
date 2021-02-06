/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Classe;
import model.Convert;
import model.Etudiant;
import model.Personne;
import model.Professeur;

/**
 *
 * @author user
 */
public class DaoPersonne implements IDao<Personne>{
    private final String SQL_SELECT_BY_CLASSE="select p.id,nom_complet,tuteur,classe_id,libelle,nbre from personne p,classe cl where classe_id=? and cl.id=p.classe_id";
    private final String SQL_INSERT="INSERT INTO `personne` (`type`, `id`, `nom_complet`, `tuteur`, `modules`, `grade`, `classe_id`) VALUES (?,?,?,?,?, ?,?);";
    private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule='?'";
    private final String SQL_SELECT_ALL_PROFESSEUR="select * from personne where type='Professeur'";
     private final String SQL_SELECT_CONNECT="select * from personne where login=? and pwd=?";
     private DaoMySql mysql;

    public DaoPersonne() {
        mysql= new DaoMySql();
    }
    
    public List<Personne> findByClasse(Classe classe){
        List<Personne> lEtudiants=new ArrayList<>();
        //recuperation
        
        try {
            //1 ouvrir la connexion
            mysql.ouvrirConnexionBD();
            //2 preparer la requete
            mysql.preparerRequete(SQL_SELECT_BY_CLASSE);
            //vérification des parametres et injection dans la requete
            mysql.getPs().setInt(1,classe.getId());
            //execution de la requete
            ResultSet rs=mysql.executeSelect();
            //etape de recuperation des informations de la requete
            while(rs.next()){
                //recuperer les données des étudiants
                Etudiant etu=new Etudiant();
                etu.setNomComplet(rs.getString("nom_complet"));
                etu.setId(rs.getInt("id"));
                etu.setTuteur(rs.getString("tuteur"));
                //recuperer les données de la classe
                Classe cl=new Classe();
                cl.setId(rs.getInt("classe_id"));
                cl.setLibelle(rs.getString("libelle"));
                cl.setNbre(rs.getInt("nombre"));
                //faire la relation
                etu.setCl(cl);
                //ajouter l'étudiant dans la liste
                lEtudiants.add(etu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            mysql.closeConnection();
        }
        return lEtudiants;
    }
    @Override
    public int insert(Personne pers){
        int nbreLigne=0;
        //Traitement Insertion
        return nbreLigne;
        
    }
    public Professeur findProfesseurByMatricule(String matricule){
        Professeur professeur=null;
        //Recherche
        
        try {
             //1 ouvrir la connexion
            mysql.ouvrirConnexionBD();
            //2 preparer la requete
            mysql.preparerRequete(SQL_SELECT_PROFESSEUR);
            mysql.getPs().setString(1, matricule);
            ResultSet rs=mysql.executeSelect();
            if(rs.next()){
                professeur=new Professeur();
                professeur.setId(rs.getInt("id"));
                professeur.setNomComplet(rs.getString("nom_complet"));
                professeur.setGrade(rs.getString("grade"));
                professeur.setMatricule(rs.getString("matricule"));
                
                professeur.setModules(Convert.stringToList(rs.getString("modules")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
        return professeur;
    }
    public List<Professeur> findProfesseur(){
        List<Professeur>lProfesseurs=new ArrayList<>();
        
        //Remplir la liste
        return lProfesseurs;
    }
    public Personne findUserConnect(String login,String pwd){
        Personne personne=null;
        return personne;
    }
}
