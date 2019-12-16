package ch.heg.ig.sda.business;

public class Colis{
    private double poids;
    private double largeur;
    private double profondeur;
    private double distanceAParcourir;

    public Colis() {
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }

    public double getDistance() {
        return distanceAParcourir;
    }

    public void setDistance(double distanceAParcourir) {
        this.distanceAParcourir = distanceAParcourir;
    }
}