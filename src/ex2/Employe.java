/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Maxime BLAISE
 */
public class Employe {

    /**
     * Nom de l'employe.
     */
    private String nom;
    
    /**
     * Salaire de l'employé
     */
    private int salaire;
    

    /**
     * Créer un employé à partir de son nom.
     *
     * @param nom Nom de l'employé
     */
    public Employe(String nom) {
        this.nom = nom;
    }

    /**
     * Créer un employé à partir de son nom et de son salaire
     *
     * @param nom Nom de l'employé
     * @param salaire Salaire de l'employé
     */
    public Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }
    
    

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    
    
    
    /**
     * Affiche un employée
     * 
     * @return ...
     */
    @Override
    public String toString() {
        return ("\t"+nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
}
