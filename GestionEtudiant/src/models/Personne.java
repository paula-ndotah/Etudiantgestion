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
public abstract class Personne {
    protected int id;
    protected String nomComplet;
    private Etudiant Etudiant;
    private Professeur Professeur;
    
    List<String> lString=new ArrayList();
    
    

    public Personne() {
    }

    public Personne(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Personne(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Etudiant getEtudiant() {
        return Etudiant;
    }

    public void setEtudiant(Etudiant Etudiant) {
        this.Etudiant = Etudiant;
    }

    public Professeur getProfesseur() {
        return Professeur;
    }

    public void setProfesseur(Professeur Professeur) {
        this.Professeur = Professeur;
    }
    
    
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nomComplet=" + nomComplet + '}';
    }
    
    
}
