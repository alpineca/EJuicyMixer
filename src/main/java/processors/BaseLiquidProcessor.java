package processors;

import models.BaseLiquid;

import java.util.ArrayList;
import java.util.List;

public class BaseLiquidProcessor {

    private static BaseLiquidProcessor instance;
    private List<BaseLiquid> basesList;


    private BaseLiquidProcessor() {
        this.basesList = new ArrayList<>();
        createBases();
        System.out.println("***************");
        System.out.println("*BASES CREATED*");
        System.out.println("***************");
    }

    public static BaseLiquidProcessor getInstance(){
        if(instance == null){
            instance = new BaseLiquidProcessor();
        }
        return instance;
    }

    public List<BaseLiquid> loadAllBases() {
        System.out.println("**************");
        System.out.println("*BASES LOADED*");
        System.out.println("**************");

        return basesList;
    }

    public void addNewBase(BaseLiquid newBase){
        basesList.add(newBase);
    }

    public void saveAllBases(){
        System.out.println("*************");
        System.out.println("*BASES SAVED*");
        System.out.println("*************");
    }

    private void createBases(){
        basesList.add(new BaseLiquid("Strong AF", 150));
        basesList.add(new BaseLiquid("Weak Shit", 1000));
        basesList.add(new BaseLiquid("Roses Dreams", 200));
    }

}
