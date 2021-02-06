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
public class Etudiant extends Personne{
    private String tuteur;
    //Association ManytoOne
    private Classe cl;
    
    //default
    public Etudiant() {   
        super();
        type="Etudiant";
    }
    //surcharge
    public Etudiant(String tuteur, int id, String nomComplet) {
        super(id, nomComplet);
        this.tuteur = tuteur;
        type="Etudiant";
    }
    //select
    public Etudiant(String tuteur, String nomComplet) {
        super(nomComplet);
        this.tuteur = tuteur;
        type="Etudiant";
    }
    
    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    @Override
    public String toString() {
        return super.toString()+"Tuteur:"+tuteur+" classe:"+cl.getLibelle(); //To change body of generated methods, choose Tools | Templates.
    }

    public Classe getCl() {
        return cl;
    }

    public void setCl(Classe cl) {
        this.cl = cl;
    }

    
   

    
    
    
}
