package models;

import static eu.hansolo.tilesfx.tools.Helper.round;

public class PropyleneGlycol {
    private final double weigth = 0.96527;
    private double volume;

    public PropyleneGlycol(double volume) {
        this.volume = volume;
    }
    public PropyleneGlycol(){

    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    public double getFinalWeigth(){
        return weigth;
    }

    public double getWeigth(){
        return round(volume*weigth, 2);
    }
}
