package Interfaces.Impliment;

import Interfaces.InterfaceSociete;
import entites.Departement;
import entites.Employe;

import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> employesDepartements = new TreeMap<>(new EmployeComparator());

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

    private class EmployeComparator implements java.util.Comparator<Employe> {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getNom().compareTo(e2.getNom());
        }
    }
}
