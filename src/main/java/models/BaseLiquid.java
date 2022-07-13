package models;

public class BaseLiquid {
    private String baseName;
    private double desiredAmmount;

//    private double desiredStrength;
//    private double desiredDiluent;
//    private PropyleneGlycol desiredPG;
//    private VegetableGlycerin desiredVG;

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public double getDesiredAmmount() {
        return desiredAmmount;
    }

    public void setDesiredAmmount(double desiredAmmount) {
        this.desiredAmmount = desiredAmmount;
    }

    public BaseLiquid(String baseName, double desiredAmmount) {
        this.baseName = baseName;
        this.desiredAmmount = desiredAmmount;
    }
    public BaseLiquid(){

    }
}
