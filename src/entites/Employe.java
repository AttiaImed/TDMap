package entites;

import java.util.Objects;

public class Employe {
    private int cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe() {}

    public Employe(int cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe [cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employe employe = (Employe) obj;
        return cin == employe.cin && matricule.equals(employe.matricule) && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin);
    }
}