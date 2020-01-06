package ch.heg.ig.sda.business;

public class Drone {
    // Dataset dans drones.csv
    private Integer id;
    private String marque;
    private double distanceMax; //En KM
    private double poidsMax; // En KG
    private double largeurColisMax; //En
    private double hauteurColiMax; // En MM
    private double profondeurColisMax; // En MM

    public Drone() {

    }

    public Drone(double distanceMax, String marque, double  poidsMax) {
        this.distanceMax = distanceMax;
        this.marque = marque;
        this.poidsMax = poidsMax;

    }

    @Override
    public String toString() {
        return "Drone{" +
                "marque='" + marque +
                ", distanceMax=" + distanceMax + '\'' +
                ", poidsMax=" + poidsMax +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getDistanceMax() {
        return distanceMax;
    }

    public void setDistanceMax(Double distanceMax) {
        this.distanceMax = distanceMax;
    }

    public Double getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(Double poidsMax) {
        this.poidsMax = poidsMax;
    }

    public Double getLargeurColisMax() {
        return largeurColisMax;
    }

    public void setLargeurColisMax(Double largeurColisMax) {
        this.largeurColisMax = largeurColisMax;
    }

    public Double getHauteurColiMax() {
        return hauteurColiMax;
    }

    public void setHauteurColiMax(Double hauteurColiMax) {
        this.hauteurColiMax = hauteurColiMax;
    }

    public Double getProfondeurColisMax() {
        return profondeurColisMax;
    }

    public void setProfondeurColisMax(Double profondeurColisMax) {
        this.profondeurColisMax = profondeurColisMax;
    }
}
