/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class Details {
    private String annee;
    private List<String> modules=new ArrayList();
    //ManytoOne
    private Classe cl;
    private Professeur Professeur;

    public Details(String annee) {
        this.annee = annee;
    }

    public Details() {
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public Classe getCl() {
        return cl;
    }

    public void setCl(Classe cl) {
        this.cl = cl;
    }

    public Professeur getProfesseur() {
        return Professeur;
    }

    public void setProfesseur(Professeur Professeur) {
        this.Professeur = Professeur;
    }
    
    
   
    
}
