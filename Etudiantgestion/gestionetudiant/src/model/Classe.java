/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Classe {
    private int id;
    private String  libelle;
    private int nbre;

    //default
    public Classe() {
    }
    //findbyclasse
    public Classe(int id) {
        this.id = id;
    }
    
    //surcharge
    
    public Classe(int id, String libelle, int nbre) {
        this.id = id;
        this.libelle = libelle;
        this.nbre = nbre;
    }
    //select

    public Classe(String libelle, int nbre) {
        this.libelle = libelle;
        this.nbre = nbre;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbre() {
        return nbre;
    }

    public void setNbre(int nbre) {
        this.nbre = nbre;
    }

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", libelle=" + libelle + ", nbre=" + nbre + '}';
    }

    public boolean creerClasse(Classe classe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
