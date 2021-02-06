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
public class Details {
    private String annee;
    private List<String> modules;
    //ManytoOne
    private Classe classe;
    private Professeur professeur;

    public Details(String annee) {
        this.annee = annee;
    }

    public Details(Classe classe, Professeur professeur) {
        this.classe = classe;
        this.professeur = professeur;
    }
    
    public Details() {
    }

    public Details(String annee, List<String> modules, Classe classe, Professeur professeur) {
        this.annee = annee;
        this.modules = modules;
        this.classe = classe;
        this.professeur = professeur;
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    }
