import Interfaces.Impliment.SocieteHashMap;
import Interfaces.Impliment.SocieteTreeMap;
import Interfaces.InterfaceSociete;
import entites.Departement;
import entites.Employe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            Employe e1 = new Employe(12345678, "E001", "Attia", "Imed");
            Employe e2 = new Employe(87654321, "E002", "Mahmud", "Grih");
            Employe e3 = new Employe(14562456, "E003", "Alaa", "Gobgi");

            Departement d1 = new Departement(1, "Dev");
            Departement d2 = new Departement(2, "Marketing");

            InterfaceSociete societeHashMap = new SocieteHashMap();
            InterfaceSociete societeTreeMap = new SocieteTreeMap();

            societeHashMap.ajouterEmployeDepartement(e1, d1);
            societeHashMap.ajouterEmployeDepartement(e2, d2);
            societeTreeMap.ajouterEmployeDepartement(e3, d1);

            System.out.println("******employés hash*******");
            societeHashMap.afficherLesEmployesLeursDepartements();

            System.out.println("\n ******employés tree*******");
            societeTreeMap.afficherLesEmployesLeursDepartements();

            societeHashMap.supprimerEmploye(e1);

            societeHashMap.afficherLesEmployesLeursDepartements();

            System.out.println(societeHashMap.rechercherEmploye(e2));
            System.out.println(societeTreeMap.rechercherEmploye(e3));

            System.out.println("les départements de hashmap");
            societeHashMap.afficherLesDepartements();

            System.out.println("les départements de treemap");
            societeTreeMap.afficherLesDepartements();

            societeHashMap.afficherDepartement(e2);
            societeTreeMap.afficherDepartement(e2);
        }
}