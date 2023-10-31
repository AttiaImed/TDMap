package Interfaces.Impliment;

import Interfaces.InterfaceSociete;
import entites.Departement;
import entites.Employe;

import java.util.HashMap;



public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> employesDepartements = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employesDepartements.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employesDepartements.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Employe e : employesDepartements.keySet()) {
            System.out.println(e.toString() + " travaille dans le département " + employesDepartements.get(e).getNom());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employesDepartements.keySet()) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employesDepartements.values()) {
            System.out.println(d.toString());
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employesDepartements.get(e);
        if (d != null) {
            System.out.println(e.toString() + " travaille dans le département " + d.getNom());
        } else {
            System.out.println(e.toString() + " ne travaille dans aucun département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employesDepartements.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employesDepartements.containsValue(d);
    }
}