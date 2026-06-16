package GesEcole.Services;
import Entity.Prof;
public class profService {
    Prof[] profs=new Prof[100];
    int nbProfs=0;
    public void ajouter(Prof p){
        profs[nbProfs]=p;
        nbProfs++;
    }
}
