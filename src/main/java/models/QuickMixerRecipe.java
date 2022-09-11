package models;

import java.text.DecimalFormat;

public class QuickMixerRecipe {
    private String totalAmountMl;
    private String totalAmountGr;
    private String baseTotalMl;
    private String baseTotalGr;
    private String delutantMl;
    private String delutantGr;
    private String flavourOneMl;
    private String flavourOneGr;
    private String flavourTwoMl;
    private String flavourTwoGr;
    private String flavourThreeMl;
    private String flavourThreeGr;
    private String otherMl;
    private String otherGr;

    private static final DecimalFormat deForm = new DecimalFormat("0.00");

    public QuickMixerRecipe(){

    }

    public String getTotalAmountMl() {
        return totalAmountMl;
    }

    public void setTotalAmountMl(double totalAmountMl) {
        this.totalAmountMl = formatValue(totalAmountMl);
    }

    public String getTotalAmountGr() {
        return totalAmountGr;
    }

    public void setTotalAmountGr(double totalAmountGr) {
        this.totalAmountGr = formatValue(totalAmountGr);
    }

    public String getBaseTotalMl() {
        return baseTotalMl;
    }

    public void setBaseTotalMl(double baseTotalMl) {
        this.baseTotalMl = formatValue(baseTotalMl);
    }

    public String getBaseTotalGr() {
        return baseTotalGr;
    }

    public void setBaseTotalGr(double baseTotalGr) {
        this.baseTotalGr = formatValue(baseTotalGr);
    }

    public String getDelutantMl() {
        return delutantMl;
    }

    public void setDelutantMl(double delutantMl) {
        this.delutantMl = formatValue(delutantMl);
    }

    public String getDelutantGr() {
        return delutantGr;
    }

    public void setDelutantGr(double delutantGr) {
        this.delutantGr = formatValue(delutantGr);
    }

    public String getFlavourOneMl() {
        return flavourOneMl;
    }

    public void setFlavourOneMl(double flavourOneMl) {
        this.flavourOneMl = formatValue(flavourOneMl);
    }

    public String getFlavourOneGr() {
        return flavourOneGr;
    }

    public void setFlavourOneGr(double flavourOneGr) {
        this.flavourOneGr = formatValue(flavourOneGr);
    }

    public String getFlavourTwoMl() {
        return flavourTwoMl;
    }

    public void setFlavourTwoMl(double flavourTwoMl) {
        this.flavourTwoMl = formatValue(flavourTwoMl);
    }

    public String getFlavourTwoGr() {
        return flavourTwoGr;
    }

    public void setFlavourTwoGr(double flavourTwoGr) {
        this.flavourTwoGr = formatValue(flavourTwoGr);
    }

    public String getFlavourThreeMl() {
        return flavourThreeMl;
    }

    public void setFlavourThreeMl(double flavourThreeMl) {
        this.flavourThreeMl = formatValue(flavourThreeMl);
    }

    public String getFlavourThreeGr() {
        return flavourThreeGr;
    }

    public void setFlavourThreeGr(double flavourThreeGr) {
        this.flavourThreeGr = formatValue(flavourThreeGr);
    }

    public String getOtherMl() {
        return otherMl;
    }

    public void setOtherMl(double otherMl) {
        this.otherMl = formatValue(otherMl);
    }

    public String getOtherGr() {
        return otherGr;
    }

    public void setOtherGr(double otherGr) {
        this.otherGr = formatValue(otherGr);
    }

    private String formatValue(double valueToFormat){
        if(valueToFormat > 0){
            return String.valueOf(deForm.format(valueToFormat));
        }
        return "";
    }
}
