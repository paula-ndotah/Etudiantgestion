/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Details;
import models.Personne;

/**
 *
 * @author acer
 */
public class DaoDetails {
    private final String SQL_INSERT="INSERT INTO `details` (`modules`, `annee`, `classe_id`, `professeur_id`) VALUES ('?', '?',?,?);";
    private final String SQL_SELECT_BY_PROFESSEUR="select modules and classe_id from details where professeur_id=?";
    private final String SQL_SELECT_BY_CLASSE="select modules from details where classe_id=? and professeur_id=?";
    public int insert(Details details){
        int nbreLigne=0;
        //Traitement insertion
        return nbreLigne;
    }
    public List<Details> findModulesByProfesseur(Personne pers){
    List<Details> lModules=new ArrayList<>();
    //Recuperation
    return lModules;
    
}
    public List<Details> findModulesByClasse(Classe classe){
        List<Details> lModules=new ArrayList<>();
        return lModules;
    }
}
