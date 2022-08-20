package models;

import static eu.hansolo.tilesfx.tools.Helper.round;

public class VegetableGlycerin {
    public final double weigth = 1.25937;
    public double volume;

    public VegetableGlycerin(double volume) {
        this.volume = volume;
    }
    public VegetableGlycerin() {

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
