package models;

public class QuickMixerInput {
    private double targetAmount;
    private double basePg;
    private double baseVg;
    private String delutantName;
    private double delutant;
    private String flavourOneName;
    private double flavourOne;
    private String flavourTwoName;
    private double flavourTwo;
    private String flavourThreeName;
    private double flavourThree;
    private String otherSubstanceName;
    private double other;

    public QuickMixerInput(){

    }

    public double getTargetAmount() {
//        checkEmpty(targetAmount);
//        if(targetAmount.equals("")) return "0";
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {

        this.targetAmount = targetAmount;

    }

    public double getBasePg() {
        return basePg;
    }

    public void setBasePg(double basePg) {
//        if(basePg.equals("")){
//            this.basePg = 0.00;
//        }
//        else{
//            this.basePg = basePg;
//        }
        this.basePg = basePg;
    }

    public double getBaseVg() {
//        checkEmpty(baseVg);
        return baseVg;
    }

    public void setBaseVg(double baseVg) {
//        if(baseVg.equals("")){
//            this.baseVg = 0.00;
//        }
//        else{
//            this.baseVg = baseVg;
//        }

        this.baseVg = baseVg;
    }

    public double getDelutant() {
//        checkEmpty(delutant);
        return delutant;
    }

    public void setDelutant(double delutant) {


        this.delutant = delutant;
    }

    public double getFlavourOne() {
//        checkEmpty(flavourOne);
        return flavourOne;
    }

    public void setFlavourOne(double flavourOne) {


        this.flavourOne = flavourOne;
    }

    public double getFlavourTwo() {
//        checkEmpty(flavourTwo);
        return flavourTwo;
    }

    public void setFlavourTwo(double flavourTwo) {


        this.flavourTwo = flavourTwo;
    }

    public double getFlavourThree() {
//        checkEmpty(flavourThree);
        return flavourThree;
    }

    public void setFlavourThree(double flavourThree) {


        this.flavourThree = flavourThree;
    }

    public double getOther() {
//        checkEmpty(other);
        return other;
    }

    public void setOther(double other) {


        this.other = other;
    }

    public String getDelutantName() {
        return delutantName;
    }

    public String getFlavourOneName() {
        return flavourOneName;
    }

    public String getFlavourTwoName() {
        return flavourTwoName;
    }

    public String getFlavourThreeName() {
        return flavourThreeName;
    }

    public String getOtherSubstanceName() {
        return otherSubstanceName;
    }

    public void setDelutantName(String delutantName) {
        this.delutantName = delutantName;
    }

    public void setFlavourOneName(String flavourOneName) {
        this.flavourOneName = flavourOneName;
    }

    public void setFlavourTwoName(String flavourTwoName) {
        this.flavourTwoName = flavourTwoName;
    }

    public void setFlavourThreeName(String flavourThreeName) {
        this.flavourThreeName = flavourThreeName;
    }

    public void setOtherSubstanceName(String otherSubstanceName) {
        this.otherSubstanceName = otherSubstanceName;
    }
}
