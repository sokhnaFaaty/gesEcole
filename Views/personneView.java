package GesEcole.Views;

public class personneView {
    profView pView;
    etudiantView eView;

    public personneView(profView pView, etudiantView eView) {
        this.pView = pView;
        this.eView = eView;
    }

    public void listerTous() {
    System.out.println("--- Liste de Tous ---");

    System.out.println("\n>> PROFESSEURS :");
    if (pView.service.nbProfs == 0) {
        System.out.println("Aucun professeur enregistré.");
    } else {
        pView.service.listerProfs();
    }

    System.out.println("\n>> ETUDIANTS :");
    if (eView.service.nbEtudiants == 0) {
        System.out.println("Aucun étudiant enregistré.");
    } else {
        eView.service.lister();
    }
}
}
