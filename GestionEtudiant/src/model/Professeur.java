/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Professeur extends Personne {
   private String grade;
   private List<String> modules=new ArrayList();
   private String matricule;

   public Professeur() {
       type="Professeur";
    }

    public Professeur(String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.grade = grade;
        type="Professeur";
    }

    public Professeur(String grade, String nomComplet) {
        super(nomComplet);
        this.grade = grade;
        type="Professeur";
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }
   
    @Override
    public String toString() {
        return super.toString()+"Grade:"+grade; //To change body of generated methods, choose Tools | Templates.
    }
   
}
