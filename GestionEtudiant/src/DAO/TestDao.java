/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Classe;

/**
 *
 * @author user
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // DaoClasse daoClasse=new DaoClasse();
        //Classe classe=new Classe("IDC3",18);
        //daoClasse.insert(classe);
        //afficher les classes
       // daoClasse.findAll().forEach((classe) ->{
       //   System.out.println(classe);
    //});
         //List<Classe> classes=daoClasse.findAll();
       // for (Classe cl:classes){
      //      System.out.println(cl);
   // }
    DaoPersonne daoPers=new DaoPersonne();
       // daoPers.findByClasse(new Classe(1)).forEach(System.out::println);
        System.out.println(daoPers.findProfesseurByMatricule("MAT20212"));
    }
    }
