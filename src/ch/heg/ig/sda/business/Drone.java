package ch.heg.ig.sda.business;

public class Drone {
    private int maxFlightDistance;
    private String name;
    private int poidsMax;
    private double formatMax;

    public Drone() {

    }

    public Drone(int maxFlightDistance, String name, int  capacity) {
        this.maxFlightDistance = maxFlightDistance;
        this.name = name;
        this.poidsMax = capacity;

    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name +
                ", maxFlightDistance=" + maxFlightDistance + '\'' +
                ", poidsMax=" + poidsMax +
                '}';
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(int capacity) {
        this.poidsMax = capacity;
    }

    public double getFormatMax() {
        return formatMax;
    }

    public void setFormatMax(double formatMax) {
        this.formatMax = formatMax;
    }



}
