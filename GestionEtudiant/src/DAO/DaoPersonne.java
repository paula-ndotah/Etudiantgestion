/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author acer
 */
public class DaoPersonne {
     private final String SQL_SELECT_BY_CLASSE="select * from personne where type='Etudiant' and classe_id=?";
    private final String SQL_INSERT="INSERT INTO `personne` (`type`, `id`, `nom_complet`, `tuteur`, `modules`, `grade`, `classe_id`) VALUES (?,?,?,?,?, ?,?);";
    private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule='?'";
    private final String SQL_SELECT_ALL="select * from personne where type='Professeur'";
    
    public List<Personne> findByClasse(Classe classe){
        List<Personne> lEtudiants=new ArrayList<>();
        //recuperation
        return lEtudiants;
    }
    public int insert(Personne pers){
        int nbreLigne=0;
        //Traitement Insertion
        return nbreLigne;
        
    }
    public Professeur findProfesseurByMatricule(String matricule){
        Professeur professeur=null;
        //Recherche
        return professeur;
    }
    public List<Personne> findAll(){
        List<Personne>lProfesseurs=new ArrayList<>();
        
        //Remplir la liste
        return lProfesseurs;
    }
}
