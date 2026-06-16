package GesEcole.Services;
import Entity.Etudiant;
public class etudiantService {
    Etudiant[] etudiants = new Etudiant[100];
    int nbEtudiants = 0;

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
}
}

