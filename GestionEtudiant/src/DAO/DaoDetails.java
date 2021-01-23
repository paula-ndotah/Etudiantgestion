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
import model.Details;
import model.Personne;
import model.Professeur;

/**
 *
 * @author user
 */
public class DaoDetails implements IDao<Details> {
    
    private final String SQL_INSERT="INSERT INTO `details` (`modules`, `annee`, `classe_id`, `professeur_id`) VALUES ('?', '?',?,?);";
    private final String SQL_SELECT_MODULES="select * from details where classe_id=? and professeur_id=?";
     private DaoMySql mysql;
    @Override
    //override:methode redéfinie
    public int insert(Details details){
        int nbreLigne=0;
         return nbreLigne;   
   
    }
       

    public List<String>findModules(Details details){
        List<String> lModules=new ArrayList<>();
        
        //Remplir la liste
        return lModules;

    }
    
}
