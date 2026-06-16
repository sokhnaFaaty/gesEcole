package GesEcole.Entity;

public class Prof extends Personne {
    private String grade;
    private String specialite;
 
    public Prof(String nom, String prenom, String email, String grade, String specialite) {
        super(nom, prenom, email);
        this.grade = grade;
        this.specialite = specialite;
    }
 
    public String getGrade() { return grade; }
    public String getSpecialite() { return specialite; }
 
    @Override
    public void afficherInfo() {
        System.out.println("=== PROFESSEUR ===");
        System.out.println("Nom       : " + nom);
        System.out.println("Prénom    : " + prenom);
        System.out.println("Email     : " + email);
        System.out.println("Grade     : " + grade);
        System.out.println("Spécialité: " + specialite);
    }
}

