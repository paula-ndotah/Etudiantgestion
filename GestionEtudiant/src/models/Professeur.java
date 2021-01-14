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
public class Professeur extends Personne {
    private String grade;
    private List<String> modules=new ArrayList();

    public Professeur() {
    }

    public Professeur(String Grade, String nomComplet) {
        super(nomComplet);
        this.grade = Grade;
    }

    public Professeur(String Grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.grade = Grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String Grade) {
        this.grade = Grade;
    }

    @Override
    public String toString() {
        return super.toString()+"Grade:"+grade; //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    
    
    
}
