package ch.heg.ig.sda.business;

public class Drone {
    // Dataset dans drones.csv
    private Integer id;
    private String marque;
    private Double distanceMax //En KM
    private Double poidsMax // En KG
    private Double largeurColisMax //En
    private Double hauteurColisMax // En MM
    private Double profondeurColisMax // En MM

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

    public Double getHauteurColisMax() {
        return hauteurColiMax;
    }

    public void setHauteurColisMax(Double hauteurColisMax) {
        this.hauteurColiMax = hauteurColiMax;
    }

    public Double getProfondeurColisMax() {
        return profondeurColisMax;
    }

    public void setProfondeurColisMax(Double profondeurColisMax) {
        this.profondeurColisMax = profondeurColisMax;
    }
}
