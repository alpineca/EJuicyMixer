package processors;

import models.AppConfig;
import models.BaseLiquid;

import java.util.ArrayList;
import java.util.List;

public class BaseLiquidProcessor {

    private static BaseLiquidProcessor instance;
    private List<BaseLiquid> basesList;


    private BaseLiquidProcessor() {
        this.basesList = new ArrayList<>();
    }

    public static BaseLiquidProcessor getInstance(){
        if(instance == null){
            instance = new BaseLiquidProcessor();
        }
        return instance;
    }

    public List<BaseLiquid> loadAllBases(){

        FilesIOProcessor.loadFile(basesList, AppConfig.BASE_LIQUIDS_SAVE_FILE);

        if(basesList.size() < 1){
            createBases();
        }

        System.out.println("***** ***** ***** ******");
        System.out.println("*BASES LOADED FROM FILE*");
        System.out.println("***** ***** ***** ******");

        return basesList;
    }

    public List<BaseLiquid> getBasesList() {
        return basesList;
    }

    public void addNewBase(BaseLiquid newBase){
        basesList.add(newBase);
    }

    public void updateRecipe(BaseLiquid baseToUpdate){
        BaseLiquid baseToRemove;
        for(BaseLiquid base : basesList){
            if(base.getBaseName().equals(baseToUpdate.getBaseName())){
                baseToRemove = base;
                basesList.add(baseToUpdate);
                basesList.remove(baseToRemove);
                break;
            }
        }
    }

    public void saveAllBases(){
        FilesIOProcessor.saveFile(basesList, AppConfig.BASE_LIQUIDS_SAVE_FILE);
    }

    private void createBases(){
        basesList.add(new BaseLiquid("Strong AF", 150));
        basesList.add(new BaseLiquid("Weak Shit", 1000));
        basesList.add(new BaseLiquid("Roses Dreams", 200));
    }

}
