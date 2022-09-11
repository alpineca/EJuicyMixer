package processors;

import models.QuickMixerInput;
import models.QuickMixerRecipe;
import utils.MainValues;
import utils.Util;

import java.text.DecimalFormat;

public class QuickMixerProcessor {
//    private final double PG_WEIGHT =

    public static QuickMixerRecipe createRecipe(QuickMixerInput inputValues){
        QuickMixerRecipe recipe = new QuickMixerRecipe();

        double totalAmountMl   = inputValues.getTargetAmount();
        double basePg          = inputValues.getBasePg();
        double baseVg          = inputValues.getBaseVg();
        double delutant        = inputValues.getDelutant();
        double flavourOne      = inputValues.getFlavourOne();
        double flavourTwo      = inputValues.getFlavourTwo();
        double flavourThree    = inputValues.getFlavourThree();
        double other           = inputValues.getOther();

        //Calc Base
        double baseTotalPercent = 100 - (delutant + flavourOne + flavourTwo + flavourThree + other);
        double baseTotalMl = (totalAmountMl*baseTotalPercent)/100;
        double baseTotalGr = ((((baseTotalMl*basePg)/100)* MainValues.PG_WEIGHT) + (((baseTotalMl*baseVg)/100)* MainValues.VG_WEIGHT));

        recipe.setBaseTotalMl(baseTotalMl);
        recipe.setBaseTotalGr(baseTotalGr);

        //Calc Delutant exaple - 5%
        double delutantMl       = totalAmountMl*(delutant/100);
        double delutantGr       = delutantMl*MainValues.DELUTANT_WEIGHT;

        recipe.setDelutantMl(delutantMl);
        recipe.setDelutantGr(delutantGr);

        //Calc Flavour One
        double flavourOneMl     = totalAmountMl*(flavourOne/100);
        double flavourOneGr     = flavourOneMl*MainValues.FLAVOUR_WEIGHT;

        recipe.setFlavourOneMl(flavourOneMl);
        recipe.setFlavourOneGr(flavourOneGr);

        //Calc Flavour Two
        double flavourTwoMl     = totalAmountMl*(flavourTwo/100);
        double flavourTwoGr     = flavourTwoMl*MainValues.FLAVOUR_WEIGHT;

        recipe.setFlavourTwoMl(flavourTwoMl);
        recipe.setFlavourTwoGr(flavourTwoGr);

        //Calc Flavour Three
        double flavourThreeMl   = totalAmountMl*(flavourThree/100);
        double flavourThreeGr   = flavourThreeMl*MainValues.FLAVOUR_WEIGHT;

        recipe.setFlavourThreeMl(flavourThreeMl);
        recipe.setFlavourThreeGr(flavourThreeGr);

        //Calc Other substance
        double otherMl          = totalAmountMl*(other/100);
        double otherGr          = otherMl*MainValues.WATER_WEIGHT;

        recipe.setOtherMl(otherMl);
        recipe.setOtherGr(otherGr);

        //Calc Total Amount
        double totalCalcAmountMl    = baseTotalMl + delutantMl + flavourOneMl + flavourTwoMl + flavourThreeMl + otherMl;
        double totalAmountGr        = baseTotalGr + delutantGr + flavourOneGr + flavourTwoGr + flavourThreeGr + otherGr;

        recipe.setTotalAmountMl(totalCalcAmountMl);
        recipe.setTotalAmountGr(totalAmountGr);

        return recipe;

    }
}
