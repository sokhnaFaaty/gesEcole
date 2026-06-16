package GesEcole.Services;
import Gestion.Entity.Etudiant;
public class etudiantService {
   public Etudiant[] etudiants = new Etudiant[100];
   public int nbEtudiants = 0;

    // Méthode pour ajouter un étudiant
    public void ajouter(Etudiant e) {
        etudiants[nbEtudiants] = e;
        nbEtudiants++;
 
    }

    public void listerEtudiants() {
    for (int i = 0; i < nbEtudiants; i++) {
        etudiants[i].afficherInfo();
        System.out.println("------------------");
    }
     
      public void lister() {
        for (int i = 0; i < nbEtudiants; i++) {
            etudiants[i].afficherInfo();
            System.out.println("------------------");
        }
    }
}
}

