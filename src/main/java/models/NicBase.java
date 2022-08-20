package models;

public class NicBase {
    private double nicStrength;
    private double ammountPG;
    private double ammountVG;

    public double getNicStrength() {
        return nicStrength;
    }

    public void setNicStrength(double nicStrength) {
        this.nicStrength = nicStrength;
    }

    public double getAmmountPG() {
        return ammountPG;
    }

    public void setAmmountPG(double ammountPG) {
        this.ammountPG = ammountPG;
    }

    public double getAmmountVG() {
        return ammountVG;
    }

    public void setAmmountVG(double ammountVG) {
        this.ammountVG = ammountVG;
    }

    public void NicBase(){

    }
    public void NicBase(double nicStrength, double ammountPG, double ammountVG){
        this.nicStrength    = nicStrength;
        this.ammountPG      = ammountPG;
        this.ammountVG      = ammountVG;
    }

}
